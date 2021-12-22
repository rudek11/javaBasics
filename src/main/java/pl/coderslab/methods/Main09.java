package pl.coderslab.strings;

public class Main09 {

    public static void main(String[] args) {

        int result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int n) {
        int sum =1;
        for (int i = 1; i <= n ; i++) {
            sum *= i;
        }return sum;
    }
}