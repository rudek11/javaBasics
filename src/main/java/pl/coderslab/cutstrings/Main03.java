package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {
        String str = " To jest tekst do ";
        System.out.println(countTokens(str));


    }

    public static int countTokens(String str) {
        String[] word = str.trim().split(" ");
        return word.length;


    }
}
