import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem755 {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
        }
        int X = s.nextInt();
        int Y = s.nextInt();
        int Z = s.nextInt();
        if (X + Y >= Z) pw.print(X + Y - Z);
        else pw.print("Impossible");
        pw.close();
    }
}
