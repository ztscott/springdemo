package com.example.service;

public class BuyException extends RuntimeException {
    public BuyException() {
        super();
    }

    public BuyException(String message) {
        super(message);
    }
}
