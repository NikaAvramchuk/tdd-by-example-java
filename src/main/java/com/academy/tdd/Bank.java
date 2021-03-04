package com.academy.tdd;

import java.util.Hashtable;

public class Bank {
    private Hashtable<Pair, Integer> hashtable = new Hashtable<>();
    public Money reduce(Expression source, String currency) {
       return source.reduce(this, currency);
    }

    int rate(String from, String to) {
        if(from.equals(to))
            return 1;
        return hashtable.get(new Pair(from,to));
    }

    public void addRate(String from, String to, int rate) {
        hashtable.put(new Pair(from,to), rate);
    }
}
