import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task839 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String S = s.nextLine();
        if (S.contains("0")){
            pw.print("NO");
        }else
        pw.print("YES");
        pw.close();
    }
}
