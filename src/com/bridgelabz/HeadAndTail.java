package com.bridgelabz;

import java.util.Random;

public class HeadAndTail {
    public static void main(String[] args) {
        int numFlips=100;
        computePercentageOfHeadsAndTails(numFlips);
    }

    public static void computePercentageOfHeadsAndTails(int numFlips) {
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numFlips; i++) {
            double randomValue = random.nextDouble();
            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = (double) headsCount / numFlips * 100;
        double tailsPercentage = (double) tailsCount / numFlips * 100;

        System.out.println("Percentage of Heads: " + headsPercentage);
        System.out.println("Percentage of Tails: " + tailsPercentage);
    }
}
