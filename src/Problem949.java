import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem949 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt(), a = s.nextInt(), b = s.nextInt();
        int[] fibb = new int[n+1];
        fibb[n] = b;
        fibb[n-1] = a;
        for (int i = n-2; i >= 0; i--) {
            fibb[i] = fibb[i+2] - fibb[i+1];
        }
        pw.print(fibb[0] +" "+ fibb[1]);
        pw.close();
    }
}
