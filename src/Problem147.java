import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem147 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        int[] arr = new int[N+1];
        arr[0] = 0;
        if (N==0){
            pw.print(0);
        }else {
            arr[1] = 1;
            for (int i = 2; i < N+1; i++) {
                arr[i]=arr[i-1] + arr[i-2];
            }
            pw.print(arr[N]);
        }
        pw.close();
    }
}
