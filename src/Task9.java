import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(new File("input.txt"));
       PrintWriter pw = new PrintWriter(new File("output.txt"));
       int n = s.nextInt();
       int[] arr = new int[n];
        int max = 0;
        int min = 0;
        int nMax = 0, nMin = 0;
        int sumPositive = 0;
        int multiplyBetween = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (i==0) {
                max = arr[0];
                min = arr[0];
            }
            if (arr[i] > 0) sumPositive+=arr[i];
            if (arr[i] > max)
            {
                max = arr[i];
                nMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                nMin = i;
            }
        }
        if (nMax > nMin)
        for (int i = nMin + 1; i < nMax; i++) {
            multiplyBetween*=arr[i];
        }
        else
            for (int i = nMax + 1; i < nMin; i++) {
            multiplyBetween*=arr[i];
        }


       pw.print(sumPositive + " " + multiplyBetween);
       pw.close();
    }
}
