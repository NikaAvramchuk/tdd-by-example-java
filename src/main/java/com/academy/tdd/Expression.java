package com.academy.tdd;

public interface Expression {
    Money reduce(Bank bank, String currency);
}
