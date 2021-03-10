
import java.util.*;
class Task79a {
    public static void main(String[] c) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt() % 10, b = s.nextInt(), m = a;
        while (b-- > 1)
            a = a*m%b;
        System.out.print(a);
    }
}