import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        int summ=0;
        for (int i = 1; i <= 1000; i++) {
            if (n % i ==0) summ+=i;
        }
        pw.print(summ);
        pw.close();
    }
}