package com.ecodation.todoapp.core.result;

public class ErrorDataResult extends DataResult{

    public ErrorDataResult(){
        super(false);
    }

    public ErrorDataResult( Object data) {
        super(false, data);
    }

    public ErrorDataResult(String message, Object data) {
        super(false, message, data);
    }
}
