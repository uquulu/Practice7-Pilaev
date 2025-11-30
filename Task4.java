import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Рядки: ");
        int r = sc.nextInt();
        System.out.print("Стовпці: ");
        int c = sc.nextInt();

        int[][] m = new int[r][c];
        Random rnd = new Random();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rnd.nextInt(50) - 25;

        System.out.println("Матриця:");
        print(m);

        System.out.print("Індекс рядка: ");
        int ri = sc.nextInt();
        System.out.print("Індекс стовпця: ");
        int ci = sc.nextInt();

        int[][] minor = buildMinor(m, ri, ci);

        System.out.println("Мінор:");
        print(minor);
    }

    private static int[][] buildMinor(int[][] m, int ri, int ci) {
        int r = m.length, c = m[0].length;
        int[][] res = new int[r - 1][c - 1];
        int rr = 0;

        for (int i = 0; i < r; i++) {
            if (i == ri) continue;
            int cc = 0;
            for (int j = 0; j < c; j++) {
                if (j == ci) continue;
                res[rr][cc++] = m[i][j];
            }
            rr++;
        }
        return res;
    }

    private static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.printf("%5d ", v);
            System.out.println();
        }
    }
}