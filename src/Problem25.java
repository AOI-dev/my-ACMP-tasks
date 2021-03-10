import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem25 {
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
            e.printStackTrace();
        }
        int A = s.nextInt();
        int B = s.nextInt();
        if (A > B){
            pw.print(">");
        }
        if (A == B){
            pw.print("=");
        }
        if (A < B){
            pw.print("<");
        }
            pw.close();
    }
}
