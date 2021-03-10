import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem694 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        int max_l =0, min_r=0;
        for (int i = 0; i < n; i++) {
            int left = s.nextInt();
            int right = s.nextInt();
            if (left > max_l || max_l == 0) max_l = left;
            if (right < min_r || min_r == 0) min_r = right;
        }
            if (max_l> min_r){
                pw.print("NO");
                pw.close();
            }else{
                pw.print("YES");
                pw.close();
            }

    }
}
