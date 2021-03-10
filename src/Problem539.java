import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem539 {
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
        int N = s.nextInt();
        if (N == 1) pw.print("0");
        else
        if (N % 2 == 0){
            pw.print(N / 2);
        }else{
            pw.print(N);
        }
        pw.close();
    }
}

