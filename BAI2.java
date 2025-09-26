import java.util.Locale;
import java.util.Scanner;

public class BAI2 {
    public static class Point {
        double x = 0;
        double y = 0;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public static double distance(Point A, Point B) {

            return Math.sqrt((A.x - B.x) * (A.x - B.x) +
                    (A.y - B.y) * (A.y - B.y));
        }
    }

    public static void main(String[] args) {
        double x, y;
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);
        System.out.print("A(x,y) >> ");
        x = inp.nextDouble();
        y = inp.nextDouble();
        Point A = new Point(x, y);

        System.out.print("B(x,y) >> ");
        x = inp.nextDouble();
        y = inp.nextDouble();
        inp.close();

        Point B = new Point(x, y);
        System.out.println("|AB| = " + Point.distance(A, B));
    }
}
