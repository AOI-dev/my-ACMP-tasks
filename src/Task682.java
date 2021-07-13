import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Task682 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger i1 = new BigInteger("10").pow(n - 1);
        BigInteger i2 = i1.multiply(new BigInteger("10"));
        BigInteger bign = i2.subtract(i1);
        BigInteger res = ((i1.add(i2.subtract(new BigInteger("1")))).multiply(bign).divide(new BigInteger("2")));
        System.out.println(res);
    }
}