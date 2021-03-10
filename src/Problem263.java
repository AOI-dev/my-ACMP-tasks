import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem263 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt(),i = s.nextInt(),j = s.nextInt();
        int p = Math.abs(i - j) - 1;
        if (p < N/2){
            pw.print(p);
        }else{
            pw.print(N - p - 2);
        }
        pw.close();
    }
}
