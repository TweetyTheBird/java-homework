package fourclasswork;

import java.util.Arrays;

public class MetMultiplyElements {
    //    Създайте метод, който намира произведението на различен брой входните параметри от int тип.
    public static void main(String[] args) {
        multiplyElements(1,2,7);
        multiplyElements(1,2,0);
        multiplyElements(-3,9);

    }

    public static void multiplyElements (int... elements ) {
        System.out.println("multiplying the following elements: " + Arrays.toString(elements));
        int result = 1;
        for (int element : elements) {
            result *= element;
        }
        System.out.println("Result from multiplication: " + result);
    }
}
