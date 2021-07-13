//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigDecimal;
//import java.math.MathContext;
//import java.math.RoundingMode;
//
//class Task411 {
//    public static void main(String[] args) throws IOException {
//        var br = new BufferedReader(new InputStreamReader(System.in));
//        String string = br.readLine();
//        var split = string.split(" ");
//        BigDecimal a = new BigDecimal(split[0]);
//        BigDecimal b = new BigDecimal(split[1]);
//        BigDecimal c = new BigDecimal(split[2]);
//        BigDecimal D = b.multiply(b).subtract(a.multiply(c).multiply(new BigDecimal("4")));
//        if (D.compareTo(new BigDecimal("0")) > 0) {
//            System.out.println(2);
//
//
//            System.out.println(b.negate().subtract(D.sqrt(new MathContext(6))).divide(a.multiply(new BigDecimal("2.0")), RoundingMode.FLOOR));
//            System.out.println(b.negate().add(D.sqrt(new MathContext(6))).divide(a.multiply(new BigDecimal("2.0")), RoundingMode.FLOOR));
//        } else if (D.compareTo(new BigDecimal("0")) < 0){
//            System.out.println(-1);
//        } else {
//            System.out.println(1);
//            System.out.println(b.negate().add(D.sqrt(new MathContext(6))).divide(a.multiply(new BigDecimal("2")), RoundingMode.FLOOR));
//        }
//
//    }
//}
