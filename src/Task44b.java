import java.io.*;

public class Task44b {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        StringBuilder s = new StringBuilder();
        while (bufferedReader.ready()) {
            s.append(bufferedReader.readLine());
        }
        String arrow_right = ">>-->", arrow_left = "<--<<";
        int counter = 0;
        for (int i = 0; i < s.length() - 5; i++) {
            if (s.substring(i, i + 5).equals(arrow_left) || s.substring(i, i + 5).equals(arrow_right)) counter++;
        }
        FileWriter fw = new FileWriter("output.txt");
        fw.write(String.valueOf(counter));
        fw.flush();
        fw.close();
        bufferedReader.close();
    }
}
