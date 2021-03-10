import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem357 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String str = s.nextLine();
        BigInteger sum_2n = new BigInteger(String.valueOf(0));
        BigInteger sum_2n_plus_1 = new BigInteger(String.valueOf(0));

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                sum_2n = sum_2n.add(new BigInteger(String.valueOf(str.charAt(i))));
            else {
                sum_2n_plus_1 = sum_2n_plus_1.add(new BigInteger(String.valueOf(str.charAt(i))));
            }
        }
        if (((sum_2n.subtract(sum_2n_plus_1)).mod(new BigInteger("11"))).equals(new BigInteger("0")))
            pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}
