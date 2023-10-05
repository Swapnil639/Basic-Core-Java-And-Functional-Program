package com.bridgelabz;


public class SwapNumber {
    public static void main(String[] args) {
        int a=Utility.scannerInt();
        int b=Utility.scannerInt();
        swapNumber(a,b);
    }

    public static void swapNumber(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
