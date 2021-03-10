import java.io.FileReader;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Scanner;
public class Task777 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int S = s.nextInt();
        int T = s.nextInt();
        if (S < T){
            pw.print(T - S);
        }else {
            pw.print(12 - (S-T));
        }
        pw.close();
    }
}