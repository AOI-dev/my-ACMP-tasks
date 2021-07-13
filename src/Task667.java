import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task667 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var split =br.readLine().split(" ");
        int n = Integer.parseInt(split[0]),
            m = Integer.parseInt(split[1]),
            k = Integer.parseInt(split[2]);

        double buses_number = (double) (m + n) / k;
        buses_number = Math.ceil(buses_number);
        if (k < 2) {
            System.out.println(0);
            return;
        }
        if (m / (int) buses_number >= 2 || (n + 2 <= k && m - 2 >= 0)) {
            System.out.println((int) buses_number);
        } else {
            System.out.println(0);
        }
    }
}