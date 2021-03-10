import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem697 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        double l = s.nextInt();
        double w = s.nextInt();
        double h = s.nextInt();

        pw.print((int) Math.ceil((2*l*h + 2*w*h)/16));
        pw.close();
    }
}