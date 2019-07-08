package com.company.fourclasswork;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class MetAverage {
    //    findAverage (int, int), който връща средно аритметичното на две числа
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 6;
        System.out.println("The average of " + firstNum + " and " + secondNum + " is " + calcAverageOfTwo(firstNum, secondNum));

    }

    public static double calcAverageOfTwo(int firstNum, int secondNum) {
        return (firstNum + secondNum) / 2.0;
    }
}
