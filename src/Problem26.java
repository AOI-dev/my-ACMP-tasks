import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int x1=s.nextInt();
        int y1=s.nextInt();
        int r1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();
        int r2=s.nextInt();
        double distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        if (distance<=r1+r2 && distance >= Math.abs(r1-r2)) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}
