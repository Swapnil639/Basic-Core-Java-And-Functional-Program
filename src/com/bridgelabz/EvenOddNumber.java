package com.bridgelabz;

public class EvenOddNumber {
    public static void main(String[] args) {
        int num=Utility.scannerInt();
        findEvenOrOddNumber(num);
    }

    public static void findEvenOrOddNumber(int num) {
        if (num%2==0){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");
        }
    }
}
