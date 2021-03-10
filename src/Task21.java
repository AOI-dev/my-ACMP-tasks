import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[] arr = new int[3];
        int max = 0, min = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = s.nextInt();
            if (i == 0){
                max = arr[0];
                min = arr[0];
            }else {
                if (arr[i] >= max) {
                    max = arr[i];
                }
                if (arr[i] <= min) {
                    min = arr[i];
                }
            }
        }
            pw.print(max - min);
        pw.close();
    }
}
