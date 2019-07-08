package com.company.fourclasswork;

import java.util.Scanner;

public class MetMinMax {
    //    метод getMax (int, int), който връща по-голямото от две числа
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 6;
        System.out.println("Between " + firstNum + " and " + secondNum + " " + calcGreaterOfTwo(firstNum, secondNum) + " is greater");

    }

    public static int calcGreaterOfTwo(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }
}
