package com.example.psywell.JSend;

public class JSendSuccess {

    private final String status;
    private Object data;
    
    public JSendSuccess(Object data) {

        this.status = JSendStatusType.SUCCESS;
        this.data = data;

    }

    public JSendSuccess() {
        this.status = JSendStatusType.SUCCESS;
    }

    public String getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

}
