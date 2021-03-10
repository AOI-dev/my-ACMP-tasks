import java.io.*;
import java.util.*;

public class Problem692 {
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("output.txt");
        if (Math.log(new Scanner(new FileReader("input.txt")).nextInt()) / Math.log(2) % 1 == 0.0) f.write("YES");
        else f.write("NO");
        f.flush();
    }
}
