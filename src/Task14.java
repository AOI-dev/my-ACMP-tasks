import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String a = String.valueOf(s.nextInt());
        String b = String.valueOf(s.nextInt());
        BigInteger A = new BigInteger(a), B = new BigInteger(b);
        BigInteger A1 = A, B1 = B;

        while (A.multiply(B).compareTo(new BigInteger("0")) == 1)
            if (A.compareTo(B) == 1 || A.compareTo(B)==0)  A = A.mod(B);
            else B = B.mod(A);
        BigInteger NOK = A1.multiply(B1);
        NOK = NOK.divide(A.add(B));
        pw.print(NOK);
        pw.close();
    }
}
