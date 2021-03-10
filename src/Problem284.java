import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem284 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        BigInteger[] array = new BigInteger[n];
            String str = s.nextLine();

            for(int i=0; i<n;i++) {
                array[i] = new BigInteger(String.valueOf(s.nextInt()));
            }
            int m = s.nextInt();
        int i,j;
        for (int k = 0; k < m; k++) {
            i = s.nextInt();
            j = s.nextInt();
            for (int l = i-1; l < j; l++) {
                pw.print(array[l] + " ");
            }
            pw.println("");
        }

        pw.print("");
        pw.close();

    }

}
