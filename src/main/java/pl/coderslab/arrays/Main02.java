package pl.coderslab.arrays;


import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(randNumbers));
        int min = randNumbers[0];
        for (int i = 0; i < randNumbers.length; i++) {
            if (randNumbers[i] < min)
                min = randNumbers[i];
        }
        System.out.println(min);

    }

}



