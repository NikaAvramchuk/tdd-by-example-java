package com.academy.tdd;

public class Bank {
    public Money reduce(Expression source, String currency) {
       return source.reduce(currency);
    }
}
