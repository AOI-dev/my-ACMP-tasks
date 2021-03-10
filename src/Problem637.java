import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem637 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        int[] arr_institutes = new int[n];
        for (int i = 0; i < n; i++) {
           arr_institutes[i] = s.nextInt();
        }
        int k = s.nextInt();
        int[] arr_zals = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (arr_institutes[j]-1>=0) {
                    arr_institutes[j]--;
                    arr_zals[i]++;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr_zals[i];
        }
        pw.print(sum);
        pw.close();
    }
}
