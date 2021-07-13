    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    class Task876 {
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));
            var split = br.readLine().split(" ");
            double a = Double.parseDouble(split[0]), b = Double.parseDouble(split[1]), r = Double.parseDouble(split[2]);
            double k = -a / b;
            // ЧТО ТУТ НЕ ТАК?
            // Моё решение неверно, потому что оно отталкивается от предположения, что прямая обязательно будет
            // касательной, но это не так
            double x0 = Math.abs(k * r / Math.sqrt(1 + k * k));
            double y0 = Math.sqrt(r*r - x0*x0);
            double f = y0 * b + x0 * a;

//            //https://mycod.net/index.php/tasksdecision/index/1509
//            double x = a * r / Math.sqrt(a*a + b*b);
//            double y = b * r / Math.sqrt(a*a + b*b);
            System.out.println(a*x0 + b*y0);
            System.out.println(x0 + " " + y0);
        }
    }