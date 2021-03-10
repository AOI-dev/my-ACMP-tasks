import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task756 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        int M = s.nextInt();
        pw.print((N-1)*M + (M-1)*N - N*M + 1);
        pw.close();
    }
}
