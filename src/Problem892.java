import java.io.*;
import java.util.Scanner;

public class Problem892 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        int N = s.nextInt();
        PrintWriter pw = new PrintWriter("output.txt");
            String[] ara_ara = new String[]{"Winter","Winter","Spring","Spring","Spring","Summer","Summer","Summer","Autumn","Autumn","Autumn","Winter"};
                if (N > 12) pw.print("Error");
                else pw.print(ara_ara[N-1]);
        pw.close();
    }
}
