import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

class Task922 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine().split(" ");

        int T1 = Integer.parseInt(st[0]),
            T2 = Integer.parseInt(st[1]),
            S1 = Integer.parseInt(st[2]),
            S2 = Integer.parseInt(st[3]),
            S = Integer.parseInt(st[4]);
        double V1 = (double) S1 / T1, V2 = (double) S2 / T2;
        if (S1 <= S2)
            System.out.println("NO");
        else {
            int d = S1 - S2;
            if (S < S1) {
                System.out.println(S / V1);
            } else {
                var var = 0;
                for (int i = S / (S1 - S2); i >= 0; i--) {
                    if (i * d + S1 < S) {
                        var = i + 1;
                        break;
                    }
                }
                System.out.println(String.format(Locale.ENGLISH,"%.2f", var * (T1 + T2) + (S - var * d) / V1));
            }
        }
    }
}