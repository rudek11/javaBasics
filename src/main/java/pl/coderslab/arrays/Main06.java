package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main06 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        Random random1 = new Random();
        int[] secdondNumbers = new int[10];
        for (int i = 0; i < secdondNumbers.length; i++) {
            numbers[i] = random1.nextInt(101);

        }
        int [] sumTable = new int[10];
        for (int i = 0; i < secdondNumbers.length; i++) {
            sumTable[i] = numbers[i] + secdondNumbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secdondNumbers));
        System.out.println(Arrays.toString(sumTable));

    }
}