import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Task685 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var split = br.readLine().split(" ");
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = Integer.parseInt(split[0]);
        a[1] = Integer.parseInt(split[1]);
        a[2] = Integer.parseInt(split[2]);
        b[0] = Integer.parseInt(split[3]);
        b[1] = Integer.parseInt(split[4]);
        b[2] = Integer.parseInt(split[5]);
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a[0]*b[0] + a[1]*b[1] + a[2]*b[2]);
    }
}