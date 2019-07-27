package threehomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrReadRevSumMult {
//   Напишете програма, която създава масив с N елемента, чете стойностите му от конзолата, след което извежда всички елементи, елементите в обратен ред, сбора на елементите и произведението им

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int[] arr1 = new int[s.nextInt()];

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }

        //read array
        System.out.println("Array values: " + Arrays.toString(arr1));

        //print in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = arr1.length; i > 0; i--) {
            System.out.print(arr1[i-1] + ", ");
        }

        System.out.println("\n\r");

        //Sum all values of the array
        int sum = 0;
        for (int element : arr1) {
            sum += element;
        }

        System.out.println("Array sum all values: " + sum);

        //multiply all values of the array

        int multiply = 1;
        for (int element : arr1) {
            multiply *= element;
        }

        System.out.println("Array mutiply all values: " + multiply);
    }
}
