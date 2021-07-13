import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task677 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine().split(" ");
        byte K = Byte.parseByte(st[0]),
             N = Byte.parseByte(st[1]),
             M = Byte.parseByte(st[2]),
             D = Byte.parseByte(st[3]);
        double res = (double)D * (K * N * M) / (K * N * M - (N * M + K * M + K * N));

        if ((int) res == res && (res%K==0 && res%M==0 && res%N==0) && ((int) N * M + K * M + K * N < (int) K * N * M)) {
            System.out.println((int) res);
        } else {
            System.out.println(-1);
        }
    }
}