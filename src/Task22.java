import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        String str = Integer.toBinaryString(n);
        int iterator=0;
        for (int i = 0; i < str.length(); i++) {
            iterator+=Integer.valueOf(str.substring(i, i + 1));
        }
        pw.print(iterator);
        pw.close();
    }
}
