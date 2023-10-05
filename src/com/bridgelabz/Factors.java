package com.bridgelabz;

public class Factors {
    public static void main(String[] args) {
        int i=2,temp;
        int n=Utility.scannerInt();
        temp=n;
        while (temp>1){
            if (temp%i==0){
                System.out.println(i+",");
                temp=temp/i;
            }else {
                i++;
            }
        }
    }
}
