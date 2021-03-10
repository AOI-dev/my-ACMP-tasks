import java.io.*;
import java.util.Scanner;

public class Problem149 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int N = s.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = s.nextInt();
        }
        PrintWriter pw = new PrintWriter("output.txt");
        pw.print(array[N-1]);
        for (int i = N-2; i >= 0; i--) {
            pw.print(" " + array[i]);
        }
        pw.close();
    }
}
