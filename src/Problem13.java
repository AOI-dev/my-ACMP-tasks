import java.util.Arrays;
import java.util.Scanner;

class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        byte biki= 0, korovi = 0;
        char[] ar = String.valueOf(b).toCharArray(), br = String.valueOf(a).toCharArray();
        for (int i = 0; i < 4; i++) {
            if (ar[i] == br[i]) {
                biki++;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < br.length; j++) {
                if (ar[i] == br[j] && i!=j) {
                    korovi++;
                }
            }
        }
        System.out.println(biki + " " + korovi);
    }
}