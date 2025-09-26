import java.util.Locale;
import java.util.Scanner;

public class BAI4 {
    public static boolean isTriangle(double a, double b, double c) {
        return ((a + b > c) && (a + c > b)
                && (b + c > a));
    }

    public static double cos(double a, double b, double c) {
        return ((b * b + c * c - a * a) / (2 * b * c));
    }

    public static byte Type(double a, double b, double c) {
        double cosA = cos(a, b, c);
        double cosB = cos(b, a, c);
        double cosC = cos(c, a, b);
        if (cosA < 0 || cosB < 0 || cosC < 0)
            return 1; // tam giac tu
        if (cosA == 0 || cosB == 0 || cosC == 0)
            return 2; // tam giac vuong
        return 0;// tam giac thuong aka tam giac nhon
    }

    public static double areaTriangle(double a, double b, double c) {
        return 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a));
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);
        System.out.println("Enter a -> b -> c: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        c = inp.nextDouble();
        inp.close();

        if (!isTriangle(a, b, c)) {
            System.out.println("Not a triangle");
            return;
        } else {
            switch (Type(a, b, c)) {
                case 0:
                    System.out.println("Tam giac thuong");
                    break;
                case 1:
                    System.out.println("Tam giac tu");
                    break;
                case 2:
                    System.out.println("Tam giac vuong");
                    break;
                default:
                    break;
            }
            System.out.println("Dien tich: " + areaTriangle(a, b, c));
        }

    }
}
