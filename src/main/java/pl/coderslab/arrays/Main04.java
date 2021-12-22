package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main04 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(numbers));
        int[] reverse = new int[10];
        for (int i = numbers.length - 1; i > 0; ) {
            for (int j = 0; j < numbers.length; j++) {
                reverse[j] = numbers[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(reverse));

    }
}





