import java.util.Arrays;
import java.util.Scanner;

class Task967 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k1 = sc.nextInt(), k2= sc.nextInt();
        var a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        var b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s(a[i], k1) * s(a[i], k2);
        }
        Arrays.sort(b);
        for (var g:b) {
            System.out.print(g + " ");
        }
    }

    private static int s(int i, int k2) {
        var sum = 0;
        while (i > 0) {
            sum += i % k2;
            i /= k2;
        }
        return sum;
    }
}