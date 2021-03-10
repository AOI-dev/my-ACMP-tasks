import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem952 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n=s.nextInt();
        int m=s.nextInt();
        if (n == 0 && m ==0) pw.print("Impossible");
        else if (n == 0)  pw.print("Impossible");
        else if (m == 0) System.out.println(n + " " + n);
        else {
            if (m <= n) {
                pw.print(n + " " + (m + n - 1));
            } else {
                pw.print(m + " " + (n + m - 1));
            }
        }
        pw.close();
    }
}
