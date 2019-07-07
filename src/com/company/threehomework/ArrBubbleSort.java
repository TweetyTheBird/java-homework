package com.company.threehomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrBubbleSort {
//    Напишете програма, която създава масив с N елемента и чете стойностите му от конзолата. Сортирайте масива с помощта на Метод на мехурчето и го изведете на конзолата


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] arr1 = new int[s.nextInt()];

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }
        System.out.println("original: " + Arrays.toString(arr1));

        //bubble sort
        //see https://www.youtube.com/watch?v=F13_wsHDIG4, https://www.geeksforgeeks.org/bubble-sort/, https://www.javatpoint.com/bubble-sort-in-java
        int arr1Length = arr1.length;
        for (int i = 0; i < arr1Length-1; i++) {
            for (int j = 0; j < arr1Length-i-1; j++) {
                if (arr1[j] > arr1[j+1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted: " + Arrays.toString(arr1));
    }
}
