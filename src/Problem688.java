import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem688 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int x_susl = s.nextInt();
        int y_susl = s.nextInt();
        int x_sob = s.nextInt();
        int y_sob = s.nextInt();
        int n = s.nextInt();
        int x = 0,y = 0;
        for (int i = 0; i < n; i++) {
            x = s.nextInt();
            y = s.nextInt();
            double distance_ot_sobaki = Math.sqrt(Math.pow(x_sob - x,2) + Math.pow(y_sob - y,2));
            double distance_ot_suslika = Math.sqrt(Math.pow(x_susl - x,2) + Math.pow(y_susl - y,2));

            if (distance_ot_sobaki>= 2 * distance_ot_suslika){
                    pw.print(i+1);
                break;
            }
            if (i == n-1){
                pw.print("NO");
            }
        }

   pw.close();
    }
}
