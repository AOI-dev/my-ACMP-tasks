import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;
public class Problem529 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int y1 = s.nextInt();
        int y2 = s.nextInt();
        pw.print(Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2)));
        pw.close();
    }
}
