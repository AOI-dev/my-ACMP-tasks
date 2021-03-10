    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.PrintWriter;
    import java.util.Scanner;

    public class Task276 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner s = new Scanner(new FileReader("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt");
            int n = s.nextInt();
            int m = s.nextInt();
            int p = n/m;
            int ostatok = n % m;
            for (int i = 1; i <= m-ostatok; i++) {
                pw.print(p + " ");
            }
            for (int i = m-ostatok; i < m; i++) {
                    pw.print((p+1)+ " ");
                    ostatok--;
            }
            pw.close();
        }
    }
