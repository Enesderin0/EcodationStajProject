package com.ecodation.todoapp.core.result;

public class Result {
    private Boolean success;
    private String message;

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(Boolean success, String message) {
        this(success);
        this.message = message;
    }

    public Boolean isSuccess(){
        return this.success;
    }
    public String getMessage(){
        return this.message;
    }
}
