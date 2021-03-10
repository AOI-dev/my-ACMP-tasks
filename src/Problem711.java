import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem711 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        int m = s.nextInt();
        int min_sum = 0;
        String best_driver = null;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String driver = s.next();
            for (int j = 0; j < m; j++) {
                int element = s.nextInt();
                sum+=element;
            }
            if (min_sum==0){
               min_sum = sum;
               best_driver = driver;
            }else if (min_sum>sum){
                min_sum = sum;
                best_driver = driver;
            }
        }
        pw.print(best_driver);
        pw.close();
    }
}
