package frequently_asked_java_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_Questions {
    public static void main(String[] args) {

        System.out.println("----------------How to reverse a string-----------------");

        String str = "Beyza";
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse+= str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("----------------How to reverse an array-----------------");

        int[] numbers = {1, 2, 3, 4, 10, 22, 35};
        ArrayList<Integer> reversedNumbers = new ArrayList<>();

        for (int i = numbers.length-1; i >=0 ; i--) {
            reversedNumbers.add(numbers[i]);
        }
        System.out.println(Arrays.toString(reversedNumbers.toArray()));

        System.out.println("----------------How to -----------------");

    }
}
