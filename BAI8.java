import java.util.Scanner;

public class BAI8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        inp.close();
        if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            } else if (delta == 0) {
                System.out.println("x1 = x2 = " + (-b / (2 * a)));
            } else {
                System.out.println("There's no real solution");
            }
        } else {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("Infinite solutions");
                } else {
                    System.out.println("No Solution");
                }
            } else {
                System.out.println("x = " + (-c / b));
            }
        }
    }
}
