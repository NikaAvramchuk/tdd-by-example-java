package com.academy.tdd;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }

}
