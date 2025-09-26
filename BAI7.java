import java.util.Scanner;

public class BAI7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        inp.close();
        if (a == 0 && b != 0) {
            System.out.println("Vo Nghiem");
            return;
        }
        if (a == 0 && b == 0) {
            System.out.println("Vo so Nghiem");
            return;
        }
        System.out.println(" x = " + (-b / a));
    }
}
