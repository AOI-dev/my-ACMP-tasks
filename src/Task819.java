import java.io.*;
import java.util.Scanner;

public class Task819 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        long A = s.nextInt();
        long B = s.nextInt();
        long C = s.nextInt();
        PrintWriter pw = new PrintWriter("output.txt");
        if (A ==0 || B ==0 || C==0){
            pw.print(0+" "+0);
        }else pw.print((2*A*B + 2*B*C + 2*A*C) + " " + A*B*C);
        pw.close();
    }
}
