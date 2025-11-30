import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Рядки: ");
        int r = sc.nextInt();

        System.out.print("Стовпці: ");
        int c = sc.nextInt();

        double[][] a = new double[r][c];
        Random rnd = new Random();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = rnd.nextDouble() * 100 - 50;

        System.out.println("Початковий масив:");
        print(a);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (i % 2 != 0 || j % 2 != 0)
                    a[i][j] = Math.sqrt(Math.abs(a[i][j]));

        System.out.println("Масив після заміни:");
        print(a);
    }

    private static void print(double[][] m) {
        for (double[] row : m) {
            for (double v : row)
                System.out.printf("%8.3f ", v);
            System.out.println();
        }
    }
}