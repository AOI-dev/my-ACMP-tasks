import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task52 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String p = s.nextLine();
        if ((int)p.charAt(0) + (int)p.charAt(1) + (int)p.charAt(2) == (int)p.charAt(3) + (int)p.charAt(4) + (int)p.charAt(5))pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}