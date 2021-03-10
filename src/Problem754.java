import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem754 {
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
        int[] M = new int[3];
        M[0] = s.nextInt();
        M[1] = s.nextInt();
        M[2] = s.nextInt();
        int max = M[0];
        for (int i = 0; i < 3; i++) {
            if (M[i] > 727 || M[i] < 94) {
                pw.print("Error");
                break;
            } else if (M[i] > max) {
                max = M[i];
            }
            if (i == 2) pw.print(max);
        }
        pw.close();
    }
}
