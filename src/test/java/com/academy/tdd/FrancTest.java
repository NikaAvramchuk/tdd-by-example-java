package com.academy.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
