import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.LinkedList;

class Problem202 {
    static LinkedList<Integer> KMP(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] pi = new int[m];
        int j = 0;
        //составляем префикс-функцию
        for (int i = 1; i < m; i++) {
            pi[i] = 0;
            while (j != 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                pi[i] = j;
            }
        }
        j = 0;

        LinkedList<Integer> retIndex = new LinkedList();
        for (int i = 0; i < n; i++) {
            while (j != 0 && text.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
                if (j == m) {
                    retIndex.add(i - m + 1);
                    j = pi[j - 1];
                }
            }
        }
        return retIndex;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String text = b.readLine();
        String pattern = b.readLine();

        for (int value : KMP(text, pattern)) {
            System.out.print(value + " ");
        }
    }
}