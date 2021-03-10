import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task794 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int white = 0, red = 0;
        for (int i = 1; i <= m; i++) {
            if (i/k > red)red = i / k;
            if (i%k > white)white = i % k;
        }
        pw.print(n*(red+white));
        pw.close();
    }
}
