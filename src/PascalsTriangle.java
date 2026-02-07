import java.util.Scanner;

public class PascalsTriangle {

    static int combination(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
