package com.tcc.projeto.core.exception;

import java.util.UUID;

public class BalanceSheetException extends AbstractDomainException {

    public BalanceSheetException(String code, String message) {
        super(code, message);
    }

    public static BalanceSheetException BalanceSheetEX001_NullOrEmptyResult(UUID uuid) {
        return new BalanceSheetException("BalanceSheetEX001", "Não foi encontrar o balaço patrimonial com o este id: " + uuid.toString());
    }
}
