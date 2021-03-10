import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem514 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long a = s.nextInt();
        long max = 0;
        int i = 1;
        while (a - i >= 0) {
            a -= i;
            max = i;
            i++;
        }
        pw.print(max);
        pw.close();
    }
}