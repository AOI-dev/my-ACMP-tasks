import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem597 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = s.nextInt();
        }

        PrintWriter pw = new PrintWriter("output.txt");
        if (array[1]+array[2]<=array[0])
        pw.print("YES");else pw.print("NO");

        pw.close();
    }
}
