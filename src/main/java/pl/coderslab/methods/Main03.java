package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {

        double pln = convertToUsd(400);
        System.out.println(pln);
    }

    public static double convertToUsd(double pln) {
        return pln / 4.04;

    }

}
