import java.util.Scanner;

class Task645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var min = n;
        var min_a = n;
        var min_b = n;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b <= a && a*b <= n; b++) {
                int min1 = Math.abs(a - b)+ n - a*b;
                if (a*b <= n && min1 < min) {
                    min = min1;
                    min_a = a;
                    min_b = b;
                }
            }
        }
        System.out.println(min_a + " " + min_b);
//        System.out.println(n - min_n + " " + min_n);
    }
}