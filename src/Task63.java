import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int S = s.nextInt();
        int P = s.nextInt();
        int X,Y;
        for (X = 0, Y = 0; X < S; X++, Y = S-X) {
            if (X * Y == P){
                break;
            }
        }
        if (X<Y) pw.print(X +" "+ Y);
        else pw.print(Y +" "+ X);
        pw.close();
    }
}
