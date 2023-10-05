package com.bridgelabz;

public class Array2D {
    public static void main(String[] args) {
        int rows=Utility.scannerInt();
        int cols=Utility.scannerInt();
        int[][] arr=new int[rows][cols];

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                arr[i][j]=Utility.scannerInt();
            }
        }
        printArray(arr,rows,cols);

    }

    public static void printArray(int[][] arr,int rows,int cols) {
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
    }
}
