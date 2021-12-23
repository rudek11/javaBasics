package pl.coderslab.strings;

public class Main07 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {
        String trimStr = str.toLowerCase().replaceAll(" ", "");
        String reverse = Main06.fromBack(trimStr);
        return trimStr.equals(reverse);
    }
}