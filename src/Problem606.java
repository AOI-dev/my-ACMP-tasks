import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem606 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a + b > c && a + c > b && c + b > a){
            pw.print("YES");
        }else pw.print("NO");
        pw.close();
    }
}