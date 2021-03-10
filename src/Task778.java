import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task778 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            sum += s.nextInt();
        }
        System.out.println(sum);
        pw.print(sum/27);
        pw.close();
    }
}
