import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task643 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        String str = Integer.toBinaryString(N);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') counter++;
        }
        pw.print(N + counter);
        pw.close();
    }
}
