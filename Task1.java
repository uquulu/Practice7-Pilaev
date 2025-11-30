import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість рівнів піраміди: ");
        int n = sc.nextInt();

        int[][] pyramid = new int[n][];
        int val = 1;

        for (int i = 0; i < n; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++)
                pyramid[i][j] = val++;
        }

        System.out.println("Піраміда (зверху вниз):");
        printPyramid(pyramid);

        System.out.println("Піраміда (знизу вверх):");
        for (int i = n - 1; i >= 0; i--)
            printRow(pyramid[i], i, n);
    }

    private static void printPyramid(int[][] p) {
        int n = p.length;
        for (int i = 0; i < n; i++)
            printRow(p[i], i, n);
    }

    private static void printRow(int[] row, int level, int total) {
        for (int s = 0; s < total - level - 1; s++)
            System.out.print("  ");
        for (int v : row)
            System.out.print(v + " ");
        System.out.println();
    }
}