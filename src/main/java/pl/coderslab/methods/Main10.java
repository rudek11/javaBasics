package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
        String result = footballWin(4, 5, 6, 5);
        System.out.println(result);
    }

    public static String footballWin(int goalsAA, int goalsBA, int goalsAB, int goalsBB) {
        if (goalsAA + goalsAB > goalsBA + goalsBB) return "1";
        else if (goalsAA + goalsAB < goalsBA + goalsBB) return "2";
        else if (goalsAB > goalsBA) return "1";
        else if (goalsAB < goalsBA) return "2";
        return "X";
    }
}