import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem943 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        int M = s.nextInt();
        int Y = s.nextInt();
        int X = s.nextInt();
        if (Y % 2 == 1){            //слева направо
            pw.print(M*Y-M+X-1);
        }else{                      //справа налево
            pw.print(M*Y - M + (M - X));
        }
        pw.close();
    }
}
