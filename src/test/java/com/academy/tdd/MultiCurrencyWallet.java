package com.academy.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiCurrencyWallet {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
}
