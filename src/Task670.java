import java.util.Scanner;

class Task670 {
    public static boolean isdel(int n) {
        for (int i = 0; i < 10; i++) {
            if (String.valueOf(n).lastIndexOf(i + '0') != String.valueOf(n).indexOf(i+ '0'))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
            for (int i = 1; i <= 26057; i++) {
                if (isdel(i)) {
                } else {
                    n--;
                }
                if (n == 0) {
                    System.out.println(i);
                    break;
                }
            }

    }
}