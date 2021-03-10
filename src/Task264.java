import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task264 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        int max_ottepel_i = 0, max_ottepel = 0;
        int day;
        for (int i = 0; i < N; i++) {
            day = s.nextInt();
            if (day > 0) max_ottepel_i++;
            else {
                if (max_ottepel_i > max_ottepel) max_ottepel = max_ottepel_i;
                max_ottepel_i = 0;
            }
            if (i == N - 1 && day > 0){
                if (max_ottepel_i > max_ottepel) max_ottepel = max_ottepel_i;
            }
        }
        pw.print(max_ottepel);
        pw.close();
    }
}
