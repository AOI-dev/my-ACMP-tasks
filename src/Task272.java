import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task272 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var aa = br.readLine().split(" ");
        int max = 0, min = 0;
        for (int i = 0; i < aa.length; i++) {
            var val = Integer.parseInt(aa[i]);
            if (i%2==0) {
                if (i == 0 || val < min) {
                    min = val;
                }
            } else {
                if (i == 1 || val > max) {
                    max = val;
                }
            }
        }

        System.out.println(max + min);


    }
}