package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        boolean result = checkMaturity(20);
        System.out.println(result);

    }

    public static boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
