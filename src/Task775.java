import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

class Task775 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String n = s.nextLine();
        String m = s.nextLine();

        BigInteger iterations = new BigInteger(n).subtract(new BigInteger(m));
        for (BigInteger i = new BigInteger("0"); i.compareTo(iterations) < 0 ; i = i.add(new BigInteger("1"))) {

        }


        pw.print("");
        pw.close();
    }

}