package com.example.psywell.JSend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class JSendResult {

    private JSendResult(){}

    public static ResponseEntity<Object> success(Object data) {
        return ResponseEntity.ok().body(new JSendSuccess(data));
    }

    public static ResponseEntity<Object> success() {
        return ResponseEntity.ok().body(new JSendSuccess());
    }

    public static ResponseEntity<Object> noContent() {
        return ResponseEntity.noContent().build();
    }

    public static ResponseEntity<Object> fail(List<String> errors) {
        return ResponseEntity.ok().body(new JSendFail(errors));
    }
    public static ResponseEntity<Object> fail(String error, HttpStatus httpStatus) {
        return new ResponseEntity(new JSendFail(error),httpStatus);

    }
    public static ResponseEntity<Object> fail(String error) {
        return ResponseEntity.ok().body(new JSendFail(error));
    }

    public static ResponseEntity<Object> error(String message, Exception exception) {
        return ResponseEntity.ok().body(new JSendError(message, exception));
    }

    public static ResponseEntity<Object> error(String message) {
        return ResponseEntity.ok().body(new JSendError(message));
    }

    public static ResponseEntity<Object> error(Exception exception) {
        return ResponseEntity.ok().body(new JSendError(exception));
    }

}