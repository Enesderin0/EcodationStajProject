package com.ecodation.todoapp.core.result;

public class DataResult<T> extends Result {
    private T data;

    public DataResult(Boolean success){
        super(success);
    }
    public DataResult(Boolean success,T data) {
        super(success);
        this.data=data;
    }
    public DataResult(Boolean success, String message,T data) {
        super(success, message);
        this.data=data;
    }

    public T getData(){
        return this.data;
    }

}
