package threeclasswork;

import java.util.Scanner;

public class ArrSmallestNum {
//    Напишете програма, в която въвеждаме N на брой елементи на масива и извеждаме най-малката стойност
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] arr1 = new int[s.nextInt()];

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }

        //calculate min value
        int minNumber = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < minNumber) {
                minNumber = arr1[i];
            }
        }
        System.out.println("Min number is:" + minNumber);
    }
}
