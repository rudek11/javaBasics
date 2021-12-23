package pl.coderslab.strings;

//public class Main06 {
//
//    public static void main(String[] args) {
//
//    String str = "codersLabxyz";
//char [] charArray = str.toCharArray();
//        for (int i =str.length()-1; i >= 0 ; i--) {
//            System.out.print(charArray[i]);
//
//        }
//
//    }
//}
public class Main06 {

    public static void main(String[] args) {

        String str = "abcdeefghijk";
        String finale = fromBack(str);
        System.out.println(finale);


    }

    public static String fromBack(String str) {
        String result = "";
        char[] wordArray = str.toCharArray();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            result += wordArray[i];

        }
        return result;

    }

}