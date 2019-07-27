package threehomework;

import java.util.Scanner;

public class ArrAreIdentical {
//    Напишете програма, която създава два масива с по 5 елемента, които четем от конзолата и извежда съобщение дали масивите са еднакви

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner s = new Scanner(System.in);

        //populate arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i + " in arr1");
            arr1[i] = s.nextInt();
        }

        //populate arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter value for element " + i + " in arr2");
            arr2[i] = s.nextInt();
        }

        //check if identical
        System.out.println("Are arr1 and arr2 identical ? " + isIdentical(arr1, arr2));
    }

    public static boolean isIdentical(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
