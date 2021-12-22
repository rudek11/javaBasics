package pl.coderslab.strings;

public class Main01 {

    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        String lastChar = str.substring(str.length() - 2, str.length() - 1);
//        System.out.println(lastChar);
        char charArray[] = str.toCharArray();
        int a = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'ć') {
                a++;
            }

        }
        System.out.println(a);
    }
}
