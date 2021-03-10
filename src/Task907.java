import java.io.*;
import java.util.Scanner;

public class Task907 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int W = s.nextInt();
        int H = s.nextInt();
        int R = s.nextInt();
        PrintWriter pw = new PrintWriter("output.txt");
        if (2*R<=W && 2*R<= H) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}
