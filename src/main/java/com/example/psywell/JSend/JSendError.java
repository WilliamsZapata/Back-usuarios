package com.example.psywell.JSend;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;


public class JSendError implements Serializable {

    private String status;
    private String message;
    private JSendErrorData data;
    
    public String getStatus() {
        return status;
    }

    public JSendErrorData getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public JSendError(Exception e) {

        StringWriter errorWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(errorWriter));

        this.status = JSendStatusType.ERROR;
        this.message = JSendMesages.DEFAULT_ERROR_MESSAGE;
        this.data = new JSendErrorData(errorWriter.toString());

    }

    public JSendError(String message) {

        this.status = JSendStatusType.ERROR;
        this.message = message;

    }

    public JSendError(String message, Exception e) {

        StringWriter errorWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(errorWriter));

        this.status = JSendStatusType.ERROR;
        this.message = message;
        this.data = new JSendErrorData(errorWriter.toString());

    }

}
