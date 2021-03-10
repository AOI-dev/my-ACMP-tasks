import java.util.Scanner;

class Problem271 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int a = 0, b = 1, c = a + b, i = 1;

        while(c < n) {
            i++;
            c = a + b; //3
            a = b; // a = 1
            b = c; // b = 2
        }
        if (c == n) {
            System.out.println(1);
            System.out.print(i);
        } else {
            System.out.println(0);
        }
    }
}