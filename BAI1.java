import java.util.Locale;
import java.util.Scanner;

public class BAI1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);

        final double PI = 3.141593;
        double S = inp.nextDouble();
        inp.close();
        double V = S * (1.0 / 3.0) * Math.sqrt(S / (4.0 * PI));

        System.out.println(V);
    }
}
