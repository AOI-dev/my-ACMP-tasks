import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem324 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String S = s.nextLine();
        if (S.charAt(0) == S.charAt(3) && S.charAt(1)==S.charAt(2)) {
            pw.print("YES");
        }else pw.print("NO");

        pw.close();
    }
}
