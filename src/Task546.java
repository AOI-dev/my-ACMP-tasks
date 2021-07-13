import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task546 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int real_n;
        if (n%4!=0) {
            real_n = n + (4 - n % 4);
        } else {
            real_n = n;
        }
        boolean b = true;
        for (int i = 1, j = real_n, k = 4, counter = real_n; counter >0; i+=1, j-=1, k+=2, b=!b, counter-= 2) {
            if (b)
                System.out.format("%d %d %d %d\n", k / 4, 2-i%2, j > n ? 0 : j, i > n ? 0 : i);
            else
                System.out.format("%d %d %d %d\n", k / 4, 2-i%2, i > n ? 0 : i, j > n ? 0 : j);
        }
    }
}