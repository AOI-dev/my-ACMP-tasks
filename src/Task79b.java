import java.io.*;
import java.util.*;

public class Task79b {
    public static void main(String[] args) throws Exception {
        PrintWriter p = new PrintWriter("output.txt");
        String s;
        Op op = (line, i) -> Integer.valueOf(line.split("\\s")[i]);
        int a = op.init(s = new BufferedReader(new FileReader("input.txt")).readLine(), 0),
            b = op.init(s, 1),
            buff = a % 10;
        List<Integer> list = new ArrayList<>(4);
        while (!list.contains(buff)) {
            list.add(buff);
            buff = buff * (a % 10) % 10;
        }
        p.print(list.get((b + 3) % list.size()));
        p.close();
    }
    interface Op{
        int init(String s, int i);
    }
}
