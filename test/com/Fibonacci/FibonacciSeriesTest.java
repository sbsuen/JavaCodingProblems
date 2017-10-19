package com.Fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Seb Suen on 2017-10-19.
 */
public class FibonacciSeriesTest {
    private FibonacciSeries f = new FibonacciSeries();

    @org.junit.Test
    public void getFibonacciNumber() throws Exception {
        boolean thrown=false;
        try {
            f.getFibonacciNumber(-1);
        }catch (IllegalArgumentException e){
            thrown=true;
        }
        assertTrue(thrown);

        thrown=false;
        try {
            f.getFibonacciNumber(1);
        }catch (IllegalArgumentException e){
            thrown=true;
        }
        assertFalse(thrown);

        assertEquals(0L,f.getFibonacciNumber(0));
        assertEquals(1L,f.getFibonacciNumber(1));
        assertEquals(1L,f.getFibonacciNumber(2));

        assertEquals(5L,f.getFibonacciNumber(5));
        assertEquals(8L,f.getFibonacciNumber(6));

        assertEquals(55L,f.getFibonacciNumber(10));
        assertEquals(377L,f.getFibonacciNumber(14));

        assertEquals(2971215073L,f.getFibonacciNumber(47));
    }
}