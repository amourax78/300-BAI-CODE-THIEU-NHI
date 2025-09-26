import java.util.Locale;
import java.util.Scanner;

public class BAI5 {
    public static class Point {
        public double x = 0;
        public double y = 0;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Triangle {
        Point A, B, C;

        public Triangle(Point A, Point B, Point C) {
            this.A = A;
            this.B = B;
            this.C = C;
        }

        public double area() {
            return 0.5 * Math.abs(
                    this.A.x * (this.B.y - this.C.y)
                            - this.A.y * (this.B.x - this.C.x)
                            + this.B.x * this.C.y - this.C.x * this.B.y);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);
        Point A = new Point(inp.nextDouble(), inp.nextDouble());
        Point B = new Point(inp.nextDouble(), inp.nextDouble());
        Point C = new Point(inp.nextDouble(), inp.nextDouble());
        Point M = new Point(inp.nextDouble(), inp.nextDouble());
        inp.close();
        Triangle ABC = new Triangle(A, B, C);
        Triangle MAB = new Triangle(M, A, B);
        Triangle MBC = new Triangle(M, B, C);
        Triangle MAC = new Triangle(M, A, C);

        if (MAB.area() == 0 || MBC.area() == 0 || MAC.area() == 0) {
            System.out.print("M nam tren canh ABC");
        } else {
            if (MAB.area() + MBC.area() + MAC.area() == ABC.area()) {
                System.out.print("M nam trong ABC");
            } else {
                System.out.print("M nam ngoai ABC");
            }
        }
    }
}
