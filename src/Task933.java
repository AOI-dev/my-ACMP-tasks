import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task933 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int t = s.nextInt();
        if (t < a) pw.print(t * b);
        else pw.print(a * b + (t - a) * c);
        pw.close();
    }
}