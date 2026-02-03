// Demonstrates printing a number pyramid pattern.

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
