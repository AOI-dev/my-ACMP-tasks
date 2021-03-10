import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task108 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(new File("input.txt"));
       PrintWriter pw = new PrintWriter(new File("output.txt"));
       int n = s.nextInt();
       pw.print(n);
       pw.close();
    }
}