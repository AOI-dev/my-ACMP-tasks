import java.util.Locale;
import java.util.Scanner;

class Problem760 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();
        double res = 60.0 / sc.nextInt() * sc.nextInt();

        for (int i = 0; i < N; i++) {
            sc.nextInt();
            res += sc.nextInt() ;
        }
        System.out.printf(Locale.ENGLISH, "%.2f", res);
    }
}