import java.io.*;

public class Task947 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        FileWriter fw = new FileWriter("output.txt");
        StringBuilder s = new StringBuilder();
        while (bufferedReader.ready())
            s.append(bufferedReader.readLine());
        double value = Double.valueOf(s.toString()),
               sum = 0.5;
        int n = 2;
        while (sum < value) {
            n++;
            sum+= 1.0/n;
        }
        fw.write((n-1) + " card(s)");
    }
}