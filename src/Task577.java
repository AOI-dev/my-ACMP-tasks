import java.util.Scanner;

class Task577 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] array = new int[10];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (var c: String.valueOf(i*j).toCharArray()) {
                    array[c - '0']++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

    }
}