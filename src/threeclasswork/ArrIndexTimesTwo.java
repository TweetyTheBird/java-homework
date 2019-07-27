package threeclasswork;

import java.util.Arrays;

public class ArrIndexTimesTwo {
//    Напишете програма, която създава и извежда масив с 10 елемента и стойността на всеки елемент е равен на индекса му умножен по 2

    public static void main(String[] args) {
        int[] arrIndexTimesTwo = new int[10];

        for (int i = 0; i < arrIndexTimesTwo.length; i++) {
            arrIndexTimesTwo[i] = i*2;

        }
        System.out.println(Arrays.toString(arrIndexTimesTwo));

    }
}


