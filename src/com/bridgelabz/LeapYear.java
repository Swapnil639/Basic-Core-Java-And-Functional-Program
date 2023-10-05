package com.bridgelabz;

public class LeapYear {
    public static void main(String[] args) {
        int year=Utility.scannerInt();
        if (isLeapYear(year)){
            System.out.println(year+" is Leap year");
        }else {
            System.out.println(year+" is not Leap year");
        }
    }

    private static boolean isLeapYear(int year) {
       return year%400==0 || year%100!=0 && year%4==0;
    }
}
