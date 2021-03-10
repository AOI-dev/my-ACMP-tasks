import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long x1 = s.nextInt();
        long y1 = s.nextInt();
        long x2 = s.nextInt();
        long y2 = s.nextInt();
        long xA = s.nextInt();
        long yA = s.nextInt();
        double k;
        if (x1-x2!=0) {
            k = (y2 - y1)/(x1 - x2);


        }else{


        }

        pw.close();
    }
}
