import java.util.*;
import java.lang.Math;
public class Main {
    public static double desc(double b, double c) {
        return Math.pow(b, 2) - 4 * c;
    }

    public static double[] roots(double b, double c) {
        double delta = desc(b, c);

        if (delta > 0) {            return new double[]{(b - Math.sqrt(delta)) / 2, (b + Math.sqrt(delta)) / 2};
        } else if (delta == 0) {
            return new double[]{b / 2, b / 2};
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Завдання №2");

        double a, b, c;

        System.out.print("Введіть коефіцієнт а: ");
        a = scanner.nextDouble();

        if (a == 0) {
            System.out.print("Розв'язків немає");
            return;
        }

        System.out.print("Введіть коефіцієнт b: ");
        b = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт c: ");
        c = scanner.nextDouble();

        double[] roots = roots(b, c);

        if (a > 0) {
            if (roots == null) {
                System.out.print("x є (0;inf)");
            } else if (roots[0] > 0) {
                System.out.print("x є (0;" + roots[0] + ")U(" + roots[1] + ";inf)");
            } else if (roots[1] > 0) {
                System.out.print("x є (0;" + roots[1] + ")U(" + roots[1] + ";inf)");
            } else {
                System.out.print("x є (0;inf)");
            }
        } else if (a < 0) {
            if (roots == null) {
                System.out.print("x є (-inf;0)");
            } else if (roots[1] < 0) {
                System.out.print("x є (-inf;" + roots[0] + ")U(" + roots[1] + ";0)");
            } else if (roots[0] < 0) {
                System.out.print("x є (-inf;" + roots[0] + ")U(" + roots[0] + ";0)");
            } else {
                System.out.print("x є (-inf;0)");
            }
        }
    }
}
