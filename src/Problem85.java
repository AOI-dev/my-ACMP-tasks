import java.util.Scanner;

class Problem85 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = 1, b = 1;
        String str = "";
        for (int i = 0; i < 50; i++) {
            a = Integer.valueOf(a + "1");
            for (int j = 0; j < 50; j++) {
                b = Integer.valueOf(b + "1");
                while (a != 0 && b != 0) {
                    if (a > b)
                        a = a % b;
                    else
                        b = b % a;
                }
                System.out.print(a + b + " ");
                long a1 = String.valueOf(a).length(),
                     b1 = String.valueOf(a).length();

                while (a1 != 0 && b1 != 0) {
                    if (a1 > b1)
                        a1 = a1 % b1;
                    else
                        b1 = b1 % a1;
                }
                System.out.println(a1 + b1 + " ");
            }
        }



        System.out.println();
    }
}