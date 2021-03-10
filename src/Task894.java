import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task894 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        double S_kolca = Double.valueOf(s.next());
        double R1 = Double.valueOf(s.next());
        double S1 = Math.PI*Math.pow(R1, 2);
        double S2 = S1 - S_kolca;
        double R2 = Math.sqrt(S2/Math.PI);
        pw.print(String.format(Locale.ENGLISH, "%.3f", R2));
        pw.close();
    }
}
