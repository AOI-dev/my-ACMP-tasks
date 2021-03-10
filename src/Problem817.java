import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem817 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long n=s.nextInt();long m=s.nextInt();long d=s.nextInt();long k=s.nextInt();
        long sum = n*k*d + m*k*d - n*m*d*d;

        pw.print(sum);
        pw.close();
    }
}