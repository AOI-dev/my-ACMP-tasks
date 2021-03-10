import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem550 {
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
        int K = s.nextInt();
        if ((K % 400 == 0) || (K % 4 == 0 && K % 100 !=0)){
            pw.print("13/09/" + K);
        }
        else{
            pw.print("12/09/" + K);
        }
        pw.close();
    }
}