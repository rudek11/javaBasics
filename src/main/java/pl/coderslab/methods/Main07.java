package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        String result = checkEvenOdd(3);
        System.out.println(result);
    }

    public static String checkEvenOdd(int number) {
        if (number / 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }
}
