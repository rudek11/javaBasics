package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {

        String str = "Java-zadania-podzial-napisow";
        String[] method = onlyTwoElements(str, '-');
        String result = Arrays.toString(method);
        System.out.println(result);


    }

    public static String[] onlyTwoElements(String str, char separator) {
        int separatorPos = str.indexOf(separator);
        String[] result = new String[2];
        result[0] = str.substring(0, 4);
        result[1] = str.substring(4);
        return result;


    }
}
