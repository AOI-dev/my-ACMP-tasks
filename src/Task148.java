import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task148 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String a = s.nextLine();
        String[] words = a.split("\\s");
        int i = 0;
        BigInteger A = null, B = null;
        for(String subStr:words) {
            if (i == 0) {
                A = new BigInteger(subStr);
                i++;
            } else {
                B = new BigInteger(subStr);
            }
        }
        BigInteger AmodB = null;
        BigInteger BUFF = null;
        if (A.compareTo(B) == -1){
            A = A.add(B);
            B = A.subtract(B);
            A = A.subtract(B);
        }
        while (A.multiply(B).compareTo(new BigInteger("0"))==1)
            if (A.compareTo(B) == 1 || A.compareTo(B)==0)  A = A.mod(B);
            else B = B.mod(A);
        pw.print(A.add(B));
        pw.close();
    }
}
