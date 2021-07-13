import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Task340 {

    // на питоне прошёл. На джаве 10 тест лажает
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine().split(" ");
        int[] a = new int[] {
            Integer.parseInt(st[0]),
            Integer.parseInt(st[1]),
            Integer.parseInt(st[2])
        };
        st = br.readLine().split(" ");
        int[] b = new int[] {
            Integer.parseInt(st[0]),
            Integer.parseInt(st[1]),
            Integer.parseInt(st[2])
        };
        Arrays.sort(a);
        Arrays.sort(b);
        boolean equal = true,
                first = true,
                second = true;
        for (int i = 0; i < 3; i++) {
            equal &= a[i] == b[i];
            first &= a[i] >= b[i];
            second &= a[i] <= b[i];
        }

        if (equal) {
            System.out.println("Boxes are equal");
        } else if (first) {
            System.out.println("The first box is larger than the second one");
        } else if (second) {
            System.out.println("The first box is smaller than the second one");
        } else System.out.println("Boxes are incomparable");
    }
}