import java.util.Scanner;

class Task53 {
    public static void main(String[] args) {
        long red=0;
        long green=0;
        long blue=0;
        long black=0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long product = (i + 1)*(j + 1);
                if (product % 5 == 0) {
                    blue++;
                }else if (product % 3 == 0) {
                    green++;
                }else if (product % 2 == 0) {
                    red++;
                }else {
                    black++;
                }
            }
        }

        System.out.println("RED : " + red);
        System.out.println("GREEN : " + green);
        System.out.println("BLUE : " + blue);
        System.out.print("BLACK : " + black);
    }
}
