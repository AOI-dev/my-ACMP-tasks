import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Problem633 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        String str = s.nextLine();
        pw.print(str+": ");
        String[] arr = new String[3];
        arr[0]=s.nextLine();
        arr[1]=s.nextLine();
        arr[2]=s.nextLine();
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            if (i!=2)pw.print(arr[i]+", ");
            else pw.print(arr[i]);
        }
        pw.close();
    }
}

