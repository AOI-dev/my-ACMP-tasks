import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Problem693 {
    public static void first() throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String[] str = s.readLine().toLowerCase().split(" ");

        char[] original = str[0].toCharArray();
        char[] permuted = str[1].toCharArray();

        boolean flag;
        if (flag = (permuted.length == original.length)) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : original) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }

            for (char c : permuted) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) < 0) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void second() throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String[] str = s.readLine().toLowerCase().split(" ");

        char[] original = str[0].toCharArray();
        char[] permuted = str[1].toCharArray();
        Arrays.sort(original);
        Arrays.sort(permuted);
        String or = String.valueOf(original), per = String.valueOf(permuted);
        boolean flag = or.equals(per);
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) throws IOException {
        second();
    }
}