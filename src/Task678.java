import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task678 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String k = s.nextLine();
        boolean A = true, B = false, C = false, buff;
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == 'A') {
                buff = A;
                A = B;
                B = buff;
            } else if (k.charAt(i) == 'B') {
                buff = C;
                C = B;
                B = buff;
            } else if (k.charAt(i) == 'C') {
                buff = A;
                A = C;
                C = buff;
            }
        }
        if (A)pw.print("1");
        if (B)pw.print("2");
        if (C)pw.print("3");
        pw.close();

    }
}