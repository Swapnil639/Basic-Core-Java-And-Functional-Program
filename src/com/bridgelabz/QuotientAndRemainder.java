package com.bridgelabz;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend=20;
        int divisor=4;
        computeQuotientAndRemainder(dividend,divisor);
    }

    public static void computeQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
