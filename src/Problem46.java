import java.math.BigDecimal;
import java.math.MathContext;

class Problem46 {
    public static void main(String[] args) {
        String integer= "2";
        String fraction = "7182818284590452353602875";

        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        BigDecimal a = new BigDecimal(fraction);
        a = a.round(new MathContext(n));
        if (n == 0) {

            System.out.println(Integer.valueOf(integer) + 1);
        } else {
            System.out.println(integer + "." + a.toPlainString().substring(0, n));
        }
    }
}