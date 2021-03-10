import java.util.Scanner;

class Problem623 {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextInt();
        byte[] arr = new byte[3];
        arr[0] = 1;
        arr[1] = 1;
        if (n <= 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n; i++) {
                arr[2] = (byte) ((arr[0] + arr[1]) % 10);

                arr[0] = arr[1];
                arr[1] = arr[2];
            }
            System.out.println(arr[2]);
        }
    }
}