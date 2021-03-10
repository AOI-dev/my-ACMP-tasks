import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task948 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int k = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        pw.print(n/k + 1 +" " + n%k);
        pw.close();
    }
}
