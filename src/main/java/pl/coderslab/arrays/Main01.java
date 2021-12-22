package pl.coderslab.arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] myNumbers = createIntArray(50);
        printValuesInRows(myNumbers, 10);

    }

    public static void printValuesInRows(int[] numbersArray, int elementsCountPerRow) {
        for (int i = 0; i < numbersArray.length; i++) {
            String valueToPrint = String.valueOf(numbersArray[i]);
            if (numbersArray[i] < 10) {
                valueToPrint = "0" + valueToPrint;
            }

            System.out.print(valueToPrint + ", ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int[] createIntArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}

