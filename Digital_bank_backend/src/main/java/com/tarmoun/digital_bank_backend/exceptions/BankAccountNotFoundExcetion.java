package com.tarmoun.digital_bank_backend.exceptions;

public class BankAccountNotFoundExcetion extends Exception {
    public BankAccountNotFoundExcetion(String message) {
        super(message);
    }
}
