import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task676 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n%3 == 0) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}