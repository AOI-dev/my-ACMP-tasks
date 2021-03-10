import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task92 {
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
    long S = s.nextInt();
    pw.print(S/6 + " " + S * 4/6 + " " + S/6);
    pw.close();
}
}
