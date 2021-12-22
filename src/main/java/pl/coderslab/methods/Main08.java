package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        int result = maxOfThree(5, 6, 4);
        System.out.println(result);
    }

    public static int maxOfThree(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}