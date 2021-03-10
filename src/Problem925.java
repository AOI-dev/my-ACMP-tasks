import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem925 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int min=s.nextInt();
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if (a ==0 || b==0 || c==0){
            pw.print("0");
        }
        else if (min == 2) pw.print(Math.min(Math.min(a,c),b));
        else pw.print(Math.abs(n - Math.min(Math.min(a,c),b)));
        pw.close();
    }
}
