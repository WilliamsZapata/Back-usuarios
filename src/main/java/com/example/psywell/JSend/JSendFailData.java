package com.example.psywell.JSend;

import java.util.List;

public class JSendFailData {

    private List<String> errors;

    public JSendFailData(){}

    public JSendFailData(List<String> errors) {

        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

}
