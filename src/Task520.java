import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Task520 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        if (n % 144 / 134 == 1) {
            System.out.printf("%d %d %d", n / 144 + 1, 0, 0);
        } else if (n % 144 % 12 >= 10){
            System.out.printf("%d %d %d", n / 144, n % 144 / 12 + 1, 0);
        } else {
            System.out.printf("%d %d %d", n / 144, n % 144 / 12, n % 144 % 12);
        }
    }
}
