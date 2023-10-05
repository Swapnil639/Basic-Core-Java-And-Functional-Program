package com.bridgelabz;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num=Utility.scannerInt();
        System.out.println(computeNthHarmonicNumber(num));
    }

    public static double computeNthHarmonicNumber(int num) {
        double harmonicNumber = 0.0;

        for (int i = 1; i <= num; i++) {
            harmonicNumber += 1.0 / i;
        }

        return harmonicNumber;
    }
}
