package pl.coderslab.methods;

public class Main01 {
    public static void main(String[] args) {
        int result1 = multiply(2, 2);
        int result2 = Main01.multiply(3, 5);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static int multiply(int multipler, int index) {
        return multipler * index;
    }
}