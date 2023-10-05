package com.bridgelabz;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=Utility.scannerInt();
        printPowerOfTwo(n);
    }

    public static void printPowerOfTwo(int n) {
        int power=1;
        for (int i = 0; i <=n; i++) {
            System.out.println("2^"+i+"="+power);
            power=power*2;
        }
    }
}
