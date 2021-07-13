import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Task35 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        LinkedList<Long> result = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            String[] st = br.readLine().split(" ");
            long n = Integer.parseInt(st[0]);
            long m = Integer.parseInt(st[1]);
            long d = 19*m + (n + 239) * (n + 366) / 2;
            result.add(d);
        }
        for (var i : result) {
            System.out.println(i);
        }

    }
}