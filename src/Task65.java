import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

class Task65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> hamming = new LinkedList<Integer>();
        LinkedList<Integer> indexes = new LinkedList<Integer>();

        int min = -1;
        for (int i = 0; i < n; i++) {
            int ham = 0;
            String s_1 = br.readLine();
            for (int j = 0; j < s_1.length(); j++) {
                if (s_1.charAt(i) != s.charAt(i)) {
                    ham++;
                }
            }
            hamming.add(ham);

            if (min == -1 || ham < min) {
                min = ham;
            }
        }

        for (int i = 0; i < n; i++) {
            if (hamming.get(i) == min) {
                indexes.add(i);
            }
        }
        System.out.println(indexes.size());
        for (var a : indexes) {
            System.out.print(a + 1 + " ");
        }
    }
}