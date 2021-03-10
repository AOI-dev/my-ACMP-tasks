import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task929 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        String n = s.nextLine();
        BigInteger b = new BigInteger(n);
        BigInteger ostatok = b.mod(new BigInteger("6")); // n % 6
        BigInteger min= new BigInteger("0");
        if (ostatok.toString().equals(new BigInteger("0").toString()) ) {
            min  = b.divide(new BigInteger("6"));
        }
        else {
            min = b.divide(new BigInteger("6"));
            min = min.add(new BigInteger("7"));
            min = min.subtract(ostatok);       //min = min / 6 + 7 - n % 6
        }
        System.out.println(min);
        PrintWriter pw = new PrintWriter("output.txt");
        pw.print(min + " " + b.multiply(new BigInteger("6")));
        pw.close();
    }
}
