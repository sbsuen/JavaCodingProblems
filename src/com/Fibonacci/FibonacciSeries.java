package com.Fibonacci;

/**
 * Created by Seb Suen on 2017-10-19.
 *
 * Coding exercise created to retrieve a Fibonacci value for a given index value n
 *
 */
public class FibonacciSeries {

    public FibonacciSeries(){}

    public long getFibonacciNumber(int n){
        if (n<0)
            throw new IllegalArgumentException(String.format("Cannot input value of %d. Input must be greater than or equal to 0.",n));
        else
            return getFibonacciNumber(0L,1L,n);
    }

    private long getFibonacciNumber(long first, long second, int n){
        return n == 0 ? first : getFibonacciNumber(second, first+second, n-1);
    }
}
