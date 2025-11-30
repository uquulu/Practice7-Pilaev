import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];

        System.out.println("Введіть матрицю 5x5:");

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();
            }

        System.out.println("Матриця:");
        print(m);

        double det = determinant(toDouble(m));
        System.out.println("Визначник: " + det);
    }

    private static void print(int[][] a) {
        for (int[] r : a) {
            for (int v : r) System.out.printf("%5d ", v);
            System.out.println();
        }
    }

    private static double[][] toDouble(int[][] a) {
        double[][] d = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                d[i][j] = a[i][j];
        return d;
    }

    private static double determinant(double[][] m) {
        int n = m.length;
        double det = 1;
        for (int i = 0; i < n; i++) {
            int pivot = i;

            for (int r = i + 1; r < n; r++)
                if (Math.abs(m[r][i]) > Math.abs(m[pivot][i]))
                    pivot = r;

            if (Math.abs(m[pivot][i]) < 1e-9)
                return 0;

            if (pivot != i) {
                double[] tmp = m[i];
                m[i] = m[pivot];
                m[pivot] = tmp;
                det *= -1;
            }

            det *= m[i][i];

            for (int r = i + 1; r < n; r++) {
                double factor = m[r][i] / m[i][i];
                for (int c = i; c < n; c++)
                    m[r][c] -= m[i][c] * factor;
            }
        }
        return det;
    }
}