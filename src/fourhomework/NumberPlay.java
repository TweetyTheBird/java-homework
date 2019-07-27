package fourhomework;

import java.util.Scanner;

public class NumberPlay {

    public static void main(String[] args) {
        System.out.println
                ("Hello, this program has three main purposes \n" +
                        "1. Reverse a number \n" +
                        "2. Find factoriel \n" + // multiply all whole numbers from our chosen number down to 1
                        "3. Find average of three numbers \n" +
                        "4. End the program \n" +
                        "Please make your choice (1-4) \n");

        Scanner s = new Scanner(System.in);
        int userChoice = s.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Please enter a number to reverse");
                String numStr = s.next();
                System.out.println("reversed num is: " + reverseNum(numStr));
                break;
            case 2:
                System.out.println("Please enter a number to calculate factoriel");
                int factorielNum = s.nextInt();
                System.out.println("Factoriel of " + factorielNum + " is:" + findFactoriel(factorielNum));
                break;
            case 3:
                System.out.println("Please enter number 1 to calculate average");
                int numOne = s.nextInt();
                System.out.println("Please enter number 2 to calculate average");
                int numTwo = s.nextInt();
                System.out.println("Please enter number 3 to calculate average");
                int numThree = s.nextInt();
                System.out.println("Average of " + numOne + ", " + numTwo + " and " + numThree + " is " + avgOfThree(numOne,numTwo,numThree));
                break;
            case 4:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("invalid input");
        }


    }

    public static int reverseNum(String numStr) {
        int result;
        String strResult = "";
        int strLength = numStr.length();
        for (int i = 0; i < strLength; i++) {
            strResult += numStr.charAt(strLength - 1 - i);
        }
        result = Integer.parseInt(strResult);
        return result;
    }

    public static int findFactoriel(int factorielNum) {
        int result = 1;
        for (int i = 2; i < factorielNum + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static double avgOfThree(int numOne, int numTwo, int numThree) {
        return (numOne + numTwo + numThree)/3;
    }
}
