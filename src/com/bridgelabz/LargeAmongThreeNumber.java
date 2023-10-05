package com.bridgelabz;

public class LargeAmongThreeNumber {
    public static void main(String[] args) {
        int a=Utility.scannerInt();
        int b=Utility.scannerInt();
        int c=Utility.scannerInt();
        findLargeNumber(a,b,c);

    }

    public static void findLargeNumber(int a,int b,int c) {
        if (a>b && a>c){
            System.out.println("a is largest number");
        } else if (b>a && b>c) {
            System.out.println("b is largest number");
        }else {
            System.out.println("c is largest number");
        }
    }
}
