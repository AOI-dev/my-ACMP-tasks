import java.util.Locale;
import java.util.Scanner;

class Task706 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), x = s.nextInt(), y = s.nextInt();
        double z = (double)r * y / (2*r - x);
        System.out.println(String.format(Locale.ROOT, "%.2f", z));
        //%[argument_index$][flags][width][.precision]conversion
    }
}
