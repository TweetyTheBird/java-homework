package com.company.two;

import java.awt.*;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Plosht po 3 strani
        int tA = 5;
        int tB = 7;
        int tC = 9;
        int area = triangleAreaBySides(tA, tB, tC);

        if (area == -1) {
            System.out.println("invalid sides");
        } else {
            System.out.println("Area of triangle with sides " + tA + "," + tB + "," + tC + " is: " + area);
        }


        // (0-9) - четно или нечетно. switch-case

        int number = 9;

        //with switch
        switch (number) {
            case 0:
                System.out.println(oddOrEven(number));
                break;
            case 1:
                System.out.println(oddOrEven(number));
                break;
            case 2:
                System.out.println(oddOrEven(number));
                break;
            case 3:
                System.out.println(oddOrEven(number));
                break;
            case 4:
                System.out.println(oddOrEven(number));
                break;
            case 5:
                System.out.println(oddOrEven(number));
                break;
            case 6:
                System.out.println(oddOrEven(number));
                break;
            case 7:
                System.out.println(oddOrEven(number));
                break;
            case 8:
                System.out.println(oddOrEven(number));
                break;
            case 9:
                System.out.println(oddOrEven(number));
                break;
            default:
                System.out.println("invalid number");
                break;
        }

        // chetno ili nechetno if
        System.out.println(oddOrEven(number));

        //chislo n ot klaviatura - da se izvede sumata na vsichki 1-n

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number2 = s.nextInt();
        int result = 0;

        for (int i = number2; i > 0; i--) {
            result += i;
        }
        System.out.println("Sum of numbers betwen 1 and " + number2 + " is " + result);


        //proverete dali chislo e prosto - da se deli na edno i na sebe si
        System.out.println("Enter a number3 (isPrime)");
        int number3 = s.nextInt();
        System.out.println("Is number " + number3 + " prime: " + isPrime(number3));

        //minMax; break on 0
        int[] minMaxTest = minMaxCalc();
        System.out.println("min: " + minMaxTest[0] + " ; max: " + minMaxTest[1]);


    }


    public static String oddOrEven(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static Boolean isPrime(int n) {
        Boolean isPrimeResult = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrimeResult = false;
                break;
            }
        }
        return isPrimeResult;
    }

    public static int[] minMaxCalc() {
        int[] minMaxResult = new int[2];
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: (break on 0)");

            int number4 = s.nextInt();
            //set min result value from default zero to the first entered number
            if (minMaxResult[0] == 0) {
                minMaxResult[0] = number4;
            }
            if (minMaxResult[1] == 0) {
                minMaxResult[1] = number4;
            }
            if (number4 == 0) {
                s.close();
                return minMaxResult;
            }
            if (minMaxResult[0] > number4) {
                minMaxResult[0] = number4;
            }
            if (minMaxResult[1] < number4) {
                minMaxResult[1] = number4;
            }
        }
    }

    public static int triangleAreaBySides(int a, int b, int c) {
        //lengths of any 2 sides of a triangle must be greater than the third side.
        if (((a + b) < c) || ((a + c) < b) || ((c + b) < a)) {
            return -1;
        }
        if (a < 1 || b < 1 || c < 1) {
            return -1;
        }
        int p = (a + b + c) / 2; //perimeter
        int area = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

}
