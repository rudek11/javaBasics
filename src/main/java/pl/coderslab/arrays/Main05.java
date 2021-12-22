package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main05 {

    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(101);

        }
Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
