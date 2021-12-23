package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {
        String[] abc = {"A", "B", "C"};
        System.out.println(stringFromArray(abc));


    }

    static String stringFromArray(String[] str) {
        return String.join("  ", str);
    }
}
