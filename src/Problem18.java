import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(new File("input.txt"));
       PrintWriter pw = new PrintWriter(new File("output.txt"));
       int N = s.nextInt();
       BigDecimal answer = new BigDecimal("1");
       if (N != 0) {
           for (int i = 1; i <= N; i++) {
               answer = answer.multiply(BigDecimal.valueOf(i));
           }
       }
       pw.print(answer);
       pw.close();
    }
}
