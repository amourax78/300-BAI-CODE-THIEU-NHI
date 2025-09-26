import java.util.Locale;
import java.util.Scanner;

public class BAI3 {
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

    public static class Circle {
        Point Center;
        double Radius;

        public Circle(Point I, double radius) {
            this.Center = I;
            this.Radius = radius;
        }

        public boolean insideCircle(Point M) {
            return (Point.distance(this.Center, M) < Radius);
        }

        public boolean outsideCirle(Point M) {
            return (Point.distance(this.Center, M) > Radius);
        }

        public boolean onCirle(Point M) {
            return (Point.distance(this.Center, M) == Radius);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);
        System.out.print("Enter center >> ");
        Point C = new Point(inp.nextDouble(), inp.nextDouble());
        System.out.print("Enter radius >> ");
        Circle A = new Circle(C, inp.nextDouble());
        System.out.print("Enter point M >> ");
        Point M = new Point(inp.nextDouble(), inp.nextDouble());
        inp.close();

        if (A.insideCircle(M)) {
            System.out.println("M nam trong C");
            return;
        }
        if (A.outsideCirle(M)) {
            System.out.println("M nam ngoai C");
            return;
        }
        if (A.onCirle(M)) {
            System.out.println("M nam tren C");
            return;
        }
    }
}
