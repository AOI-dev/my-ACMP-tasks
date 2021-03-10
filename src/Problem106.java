import java.io.*;
import java.util.*;
import java.lang.*;

public class Problem106 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int N = s.nextInt();
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (s.nextInt() == 1) c++;
        }
        PrintWriter pw = new PrintWriter("output.txt");
        pw.print(Math.min(c, N - c));
        pw.close();
    }
}
