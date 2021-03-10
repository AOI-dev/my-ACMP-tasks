import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(new File("input.txt"))) {
            int n = s.nextInt();
            int sum = 0;
            if (n > 0) sum = ((1 + n)*n)/2;
            else if (n<0) sum = 1 - ((1 + (-n))*(-n))/2;
            else if (n == 0) sum = 1;

            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.print(sum);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}