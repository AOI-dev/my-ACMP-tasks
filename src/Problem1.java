import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(new File("input.txt"))) {
            int a = s.nextInt();
            int b = s.nextInt();
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.print(a+b);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}