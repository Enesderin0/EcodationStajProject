package com.ecodation.todoapp.core.result;

public class SuccessDataResult extends DataResult{
    public SuccessDataResult( Object data) {
        super(true, data);
    }

    public SuccessDataResult(String message, Object data) {
        super(true, message, data);
    }
}
