package threehomework;

import java.util.Scanner;

public class ArrReadEvenOdd {

//    Напишете програма, която създава масив с N елемента, чете стойностите му от конзолата и извежда първо всички елементи с четен индекс, а след това всички с нечетни индекс. 0-та е четно


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] arr1 = new int[s.nextInt()];

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }

        //read even
        System.out.println("Values on positions with even index: ");
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }

        System.out.println("Values on positions with odd index: ");
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
