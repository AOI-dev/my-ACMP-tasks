import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Task757 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        String str = s.nextLine();
        String[] words = str.split("\\s");
        BigInteger C = new BigInteger(words[0]);
        BigInteger H = new BigInteger(words[1]);
        BigInteger O = new BigInteger(words[2]);
        PrintWriter pw = new PrintWriter("output.txt");
        BigInteger[] araara = new BigInteger[]{O, H.divide(BigInteger.valueOf(6)), C.divide(BigInteger.valueOf(2))};
        Arrays.sort(araara);
        pw.print(araara[0]);
        pw.close();
    }
}
