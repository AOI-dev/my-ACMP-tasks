import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(new File("C:\\Users\\����\\Desktop\\acmp\\input.txt"));
       PrintWriter pw = new PrintWriter(new File("C:\\Users\\����\\Desktop\\acmp\\output.txt"));
       int n = s.nextInt();
       int[] arr = new int[n];
       int bubble;
       boolean isRepeated;
        for (int i = 0; i < n; i++) {
            bubble = s.nextInt();
            isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (bubble == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                arr[i] = bubble;
            }
        }
        int counter =0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!= 0) {
                counter++;
            }
        }
       pw.print(counter);
       pw.close();
    }
}
