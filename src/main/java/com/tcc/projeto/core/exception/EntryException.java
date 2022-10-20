package com.tcc.projeto.core.exception;

public class EntryException extends AbstractDomainException {

    public EntryException(String code, String message) {
        super(code, message);
    }

    public static EntryException EntryEX001_NullOrEmptyEntry() {
        return new EntryException("EntryEX001", "Não foi possivel salvar entrada, objeto vazio ou nulo.");
    }
}
