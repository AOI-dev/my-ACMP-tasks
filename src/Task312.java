import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task312 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int n = s.nextInt();
        final int d = a2-a1;
        pw.print(a1 + d*(n-1));
        pw.close();
    }
}

