import java.util.Scanner;

public class BAI9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x = inp.nextDouble();
        inp.close();
        int n = 0;
        x = x / 60;// convert từ phút sang độ
        while (x - 360 * n >= 360) {
            n++;
        }
        x = x - 360 * n;

        switch ((int) (x / 90)) {
            case 0:
                System.out.println("(I)");
                break;
            case 1:
                System.out.println("(II)");
                break;
            case 2:
                System.out.println("(III)");
                break;
            case 3:
                System.out.println("(IV)");
                break;
            default:
                break;
        }
        final double PI = 3.141592654;
        System.out.println("cos(x) = " + Math.cos(x * PI / 180.0));
    }
}
