package com.tcc.projeto.core.exception;

public abstract class AbstractDomainException extends RuntimeException{

    private final String code;

    public AbstractDomainException(String code, String message) {
        super(message);
        this.code = code;
    }

}
