import java.io.*;
import java.util.Scanner;

public class Task970 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int[] array = new int[3];
        array[0] = s.nextInt();
        array[1] = s.nextInt();
        array[2] = s.nextInt();

        PrintWriter pw = new PrintWriter("output.txt");
        if (array[0] + array[1] == array[2] || array[1] + array[2] == array[0] || array[0] + array[2] == array[1]) pw.print("YES");
        else pw.print("NO");
        pw.close();
    }
}