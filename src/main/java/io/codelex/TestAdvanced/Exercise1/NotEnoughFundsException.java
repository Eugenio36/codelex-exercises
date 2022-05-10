package io.codelex.TestAdvanced.Exercise1;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException(String errorMessage) {
        super(errorMessage);
    }
}

