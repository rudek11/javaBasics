package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {
        String str = "Ala ma kota";
        String search = "ma";
        boolean result = containsStr(str, search);
        System.out.println(result);
    }

    static boolean containsStr(String str, String search) {


        return str.contains(search);
    }
}
