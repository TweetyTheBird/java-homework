package threehomework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSwitchValuesInPairs {
//    Напишете програма, която създава масив с 10 елемента от числов тип. Прочита елементите от конзолата, след което обхождаме масива и разменя стойностите на елементите с индекси: 0 и 1, 2 и 3, 4 и 5, 6 и 7, 8 и 9

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner s = new Scanner(System.in);

        //populate array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter value for element " + i);
            arr1[i] = s.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr1));

        //switch in pairs
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
        }

        System.out.println("Array with reversed pairs: " + Arrays.toString(arr1));
    }
}
