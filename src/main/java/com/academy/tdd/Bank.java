package com.academy.tdd;

public class Bank {
    public Money reduce(Expression source, String currency) {
       return source.reduce(this, currency);
    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2:1;
    }
}
