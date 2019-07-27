package eighthomework;

import java.util.Scanner;

public class fiveElements {
    public static void main(String[] args) {

        int[] fiveElements = {11,22,33,44,55};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an element index");
        int eNum = s.nextInt();

        try {
            System.out.println(fiveElements[eNum]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
