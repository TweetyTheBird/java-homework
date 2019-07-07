package com.company.threehomework;

import java.util.Scanner;

public class ArrFindIndex {
//    Напишете програма, която създава масив с N елемента, чете елементите от конзолата, въвеждаме стойност за търсене и казваме на коя позиция се намира или грешка ако не е открита


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] arr1 = new int[s.nextInt()];

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }

        //find element
        System.out.println("Enter a search value");
        int searchElement = s.nextInt();
        findElement(arr1, searchElement);
    }

    public static void findElement(int[] arr, int searchElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element " + searchElement + " was found on position " + i);
            }
        }
        System.out.println("Element not found");
    }

}
