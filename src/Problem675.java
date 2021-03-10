import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem675 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String str = s.nextLine();
        String[] words = str.split("\\s");
        int n = Integer.valueOf(words[0]);
        int m = Integer.valueOf(words[1]);
        char[][] array = new char[n][m];
        for (int i = 0; i < n; i++) {
            str = s.nextLine();
            for (int j = 0; j < m; j++) {
                array[i][j] = str.charAt(j);
            }
        }
        int min = m;
        for (int i = n-1; i >= 0; i--) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                if (array[i][j]!='A' && array[i][j]!='B') counter++;
            }
            if (counter< min) min = counter;
        }
        pw.print(min);
        pw.close();
    }
}
