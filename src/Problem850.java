import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem850 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long a = s.nextInt(), b = s.nextInt();
        long max, min;
        if (a < b){
            long bubble = a;
            a = b;
            b = bubble;
        }
        max = b;
        min = (a+1)/2;
        pw.print(min + " " + max);
        pw.close();
    }
}
