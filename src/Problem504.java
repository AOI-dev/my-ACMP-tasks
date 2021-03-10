import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem504 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int k = s.nextInt();
        char[] podokon = new char[]{'G','C','V'};
        char bub;
        for (int i = 0; i < k; i++) {
            bub = podokon[1];
            podokon[1] = podokon[2];
            podokon[2] = bub;
            bub = podokon[0];
            podokon[0] = podokon[1];
            podokon[1] = bub;
        }
        pw.print(podokon[0] +""+ podokon[1] +""+ podokon[2]);
        pw.close();
    }
}