import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task843 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        StringBuilder s = new StringBuilder();
        while (bufferedReader.ready()) {
            s.append(bufferedReader.readLine());
        }
        Scanner sc = new Scanner(s.toString());

        int N = Integer.valueOf(sc.next());
        int M = Integer.valueOf(sc.next());
        int F = Integer.valueOf(sc.next());
        int L = Integer.valueOf(sc.next());


        FileWriter fw = new FileWriter("output.txt");
        fw.write((M + F - (N - L)) + " " + (M - (M + F-(N - L))) + " " + (F - (M + F-(N - L))));
        fw.flush();
    }
}
