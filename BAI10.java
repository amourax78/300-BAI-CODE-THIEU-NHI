import java.util.Scanner;

public class BAI10 {
    public static int sum2Digit(int x) {
        if (x > 9) {
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x = x / 10;
            }
            return sum;
        }
        return x;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String SIN = "";
        while (true) {
            SIN = inp.nextLine();
            if (SIN.equals(new String("0"))) {
                inp.close();
                return;
            }
            int[] oddIndex = new int[5];
            int[] evenIndex = new int[4];
            int idxE = 0, idxO = 0;
            for (int i = SIN.length() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    oddIndex[idxO++] = (int) SIN.charAt(i) - 48;
                } else {
                    evenIndex[idxE++] = (int) SIN.charAt(i) - 48;
                }
            }
            for (int i = 0; i < 4; i++) {
                evenIndex[i] = sum2Digit(evenIndex[i] * 2);
            }
            int s1 = sumOfArray(evenIndex);
            int s2 = sumOfArray(oddIndex);
            if ((s1 + s2) % 10 == 0) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }

}
