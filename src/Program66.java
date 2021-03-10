import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        char S = s.nextLine().charAt(0);

        char[] alphabet = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == S) {
                if  (i == alphabet.length - 1)
                pw.print(alphabet[0]);
                else pw.print(alphabet[i+1]);
            }
        }
        pw.close();
    }
}
