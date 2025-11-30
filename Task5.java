import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Розмірність n: ");
        int n = sc.nextInt();

        int[][] m = new int[n][n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rnd.nextInt(100);

        System.out.println("Матриця:");
        print(m);

        int[][] t = transpose(m);

        System.out.println("Транспонована:");
        print(t);
    }

    private static int[][] transpose(int[][] m) {
        int n = m.length;
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];
        return t;
    }

    private static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.printf("%5d ", v);
            System.out.println();
        }
    }
}