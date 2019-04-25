package com.minitest;

import org.junit.Test;

public class MiniTest {

    @Test
    public void stage01() {
        for (int i = 1; i <= 100; i++) {
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);
            output(fizz, buzz, i);
        }
    }


    /**
     * Stage2-new requirements
     */
    @Test
    public void stage02() {
        for (int i = 1; i <= 100; i++) {
            boolean fizz = getresult(i, 3);
            boolean buzz = getresult(i, 5);
            output(fizz, buzz, i);
        }
    }

    private boolean getresult(int current, int num) {
        return (current % num == 0 || Integer.toString(current).indexOf(Integer.toString(num)) != -1);
    }


    private void output(boolean fizz, boolean buzz, int currentNum) {
        if (fizz & buzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else {
            System.out.println(currentNum);
        }
    }
}
