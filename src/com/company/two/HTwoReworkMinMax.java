package com.company.two;

import java.util.Scanner;

public class HTwoReworkMinMax {
    public static void main(String args[]) {

        minMaxCalc();

    }

    //minMax; break on 0
    public static void minMaxCalc() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: (break on 0)");
        int testNumber = s.nextInt();
        if (testNumber == 0) {
            System.out.println("min and max: 0");
            return;
        }
        int min = testNumber;
        int max = testNumber;

        while (testNumber != 0) {
            System.out.println("Enter a number: (break on 0)");
            testNumber = s.nextInt();
            min = Math.min(min, testNumber);
            max = Math.max(max, testNumber);
        }
        System.out.println("min: " + min + "; max: " + max);
    }
}