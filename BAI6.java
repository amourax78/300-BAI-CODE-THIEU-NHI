import java.util.Scanner;

public class BAI6 {
    public static void print(int a, int b, int c) {
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        inp.close();
        if (a <= b && b <= c) {
            print(a, b, c);
            return;
        }
        if (a <= c && c <= b) {
            print(a, c, b);
            return;
        }
        if (b <= a && a <= c) {
            print(b, a, c);
            return;
        }
        if (b <= c && c <= a) {
            print(b, c, a);
            return;
        }
        if (c <= a && a <= b) {
            print(c, a, b);
            return;
        }
        if (c <= b && b <= a) {
            print(c, b, a);
            return;
        }
    }
}
