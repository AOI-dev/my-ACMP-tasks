import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task766 {
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
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();
        if (N * M >= K ) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}