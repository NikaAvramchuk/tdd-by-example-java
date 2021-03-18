package com.academy.fibonacci;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FibonacciTest {

    @Test (dataProvider = "dpMethod")
    public void testFibonacci(int number, int result) {
        assertEquals(fib(number), result);
    }

    private int fib(int number) {
        if(number==0)
            return 0;
        return 1;
    }

    @DataProvider
    public Object[][] dpMethod(){
        return new Object[][] {
                {0,0},
                {1,1}
        };
    }



}
