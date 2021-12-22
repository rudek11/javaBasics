package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        double netto = CalculateNetto(100,30);
        System.out.println(netto);
    }
    public static double CalculateNetto (double Gross, double Vat){   // Vat podane w %
        return (100-Vat)/100 * Gross;
    }
}
