import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem95 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        StringBuilder N = new StringBuilder();
        while (bufferedReader.ready()) {
            N.append(bufferedReader.readLine());
        }
        boolean flag = true;
        long sum = 0;
        long num_of_operations = 0;
        while(flag) {
            for (int i = 0; i < N.length(); i++) {
                sum+= N.charAt(i) - 48;
            }

            if (N.length() == 1) {
                flag = false;
            } else {
                num_of_operations++;
                N = new StringBuilder(String.valueOf(sum));
            }
            sum = 0;
        }
        FileWriter fw = new FileWriter("output.txt");
        fw.write(N+ " " + num_of_operations);
        fw.flush();
    }
}
