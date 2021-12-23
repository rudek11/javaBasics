package pl.coderslab.strings;

public class Main08 {

    public static void main(String[] args) {
        String str = "TaK";
        System.out.println(toggleChar(str));

    }

    static String toggleChar(String str) {
        char[] letter = str.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            if (Character.isUpperCase(letter[i]))
                letter[i] = Character.toLowerCase(letter[i]);
            else letter[i] = Character.toUpperCase(letter[i]);

        }
        return String.valueOf(letter);
    }
}