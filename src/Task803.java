import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Task803 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        String a = st[0];
        String b = st[1];
        int k = Integer.parseInt(st[2]);
        BigInteger c = new BigInteger(a).multiply(new BigInteger("10").pow(k)).divide(new BigInteger(b));
        System.out.println(c.mod(new BigInteger("10")));
    }
}