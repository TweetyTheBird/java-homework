package eighthomework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAB {
    public static void main(String[] args) {
        System.out.println(divideAB());
    }

    public static int divideAB() {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.println("Please enter a value for number a ");
            a = s.nextInt();
            System.out.println("Please enter a value for number b ");
            b = s.nextInt();

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Only integer values allowed");
            return -1;
        }
        try {
            return a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("b cannot be zero");
            return -1;
        }
    }
}
