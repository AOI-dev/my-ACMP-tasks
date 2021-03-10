import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task822 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long x1 = s.nextInt();
        long y1 = s.nextInt();
        long x2 = s.nextInt();
        long y2 = s.nextInt();
        long x3 = s.nextInt();
        long y3 = s.nextInt();
        double Space = countSpace(x1,y1,x2,y2,x3,y3);
        pw.print(Space);
        pw.close();
    }
    public static double countSpace(long x1, long y1, long x2, long y2, long x3, long y3){
        return Math.abs(((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2.0);
    }

}
