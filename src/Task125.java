import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Task125 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] matrix = new boolean[n][n];
        byte[] bridges = new byte[n];
        for (int i = 0; i < n; i++) {
            var st = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = st[j].equals("1");
            }
        }
        br.readLine();

        var st = br.readLine().split(" ");
        for (int j = 0; j < n; j++) {
            bridges[j] = Byte.parseByte(st[j]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] && bridges[j] != bridges[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}