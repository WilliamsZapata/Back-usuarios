package com.example.psywell.JSend;

import java.util.Collections;
import java.util.List;

public class JSendFail {
    
    private final String status;
    private JSendFailData data;

    public JSendFail(List<String> errors) {

        this.status = JSendStatusType.FAIL;
        this.data = new JSendFailData(errors);
        
    }

    public JSendFail(String error) {

        this.status = JSendStatusType.FAIL;
        this.data = new JSendFailData(Collections.singletonList(error));

    }

    public JSendFail(){

        this.status = JSendStatusType.FAIL;

    }

    public String getStatus() {
        return status;
    }

    public JSendFailData getData() {
        return data;
    }

    
}
