import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Task513 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getCombinations(n));
    }

    private static BigInteger getCombinations(int n) {
        BigInteger sum = new BigInteger("0");
        for (int k = 2; k <= n; k++) {
            sum = sum.add(getFactorial(n).divide(getFactorial(n-k).multiply(getFactorial(k))));
        }
        return sum;
    }

    private static BigInteger getFactorial(long n) {
        BigInteger res = new BigInteger("1");
        for (long i = 1; i <= n; i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        return res;
    }
}