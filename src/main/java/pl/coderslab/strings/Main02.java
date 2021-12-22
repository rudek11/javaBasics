package pl.coderslab.strings;

public class Main02 {

    public static void main(String[] args) {
        String text = "abcdsa";
        System.out.println(charPos(text, 's'));


    }

    static int charPos(String str, char c) {
        return str.indexOf(String.valueOf(c));


    }
}
