import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Task836 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(array);

        LinkedList<Integer> res = new LinkedList<>();
        Arrays.asList(array).forEach(elem -> {
            var octal = Integer.toOctalString(elem);
            var len = octal.length();
            if ((octal.charAt(len - 3) - '0') % 2 != 0 && elem % 2 == 0) {
                res.add(elem);
            }
        });

        //for (var elem : array) {
        //    if (elem / 64  % 2 != 0 && elem % 2 == 0) {
        //        res.add(elem);
        //    }
        //}

        System.out.println(res.size());
        for (var a : res) {
            System.out.print(a + " ");
        }
    }
}
