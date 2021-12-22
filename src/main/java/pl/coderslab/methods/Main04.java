package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        String allTogether = createName("James", "Bond", "007");
        System.out.println(allTogether);
    }

    public static String createName(String firstName, String secondName, String nickName) {
//        String s = firstName + " " + secondName + " " + nickName;
//        return s; - better option for good practises
        return firstName + " " + secondName + " " + nickName;
    }
}
