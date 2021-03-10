import java.util.Locale;
import java.util.Scanner;

public class Problem515 {
    static class pair{
        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int x, y;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pair[] parr = new pair[n];
        for (int i = 0; i < n; i++) {
            parr[i] = new pair(s.nextInt(), s.nextInt());
        }
        double l = 0;
        l+= Math.sqrt(Math.pow(parr[0].x, 2) + Math.pow(parr[0].y, 2));
        for (int i = 1; i < n; i++) {
            int x1 = parr[i].x, y1 = parr[i].y;
            int x2 = parr[i - 1].x, y2 = parr[i - 1].y;
            l+= Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        }
        l+= Math.sqrt(Math.pow(parr[n-1].x, 2) + Math.pow(parr[n-1].y, 2));
        System.out.println(String.format(Locale.ROOT, "%.3f", l));
    }
}
