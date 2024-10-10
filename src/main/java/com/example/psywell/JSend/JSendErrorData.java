package com.example.psywell.JSend;

public class JSendErrorData {

    private String exception;

    public JSendErrorData(String exceptionString) {

        this.exception = exceptionString;
        
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

}
