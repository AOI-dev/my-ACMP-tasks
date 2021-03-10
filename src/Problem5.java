    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.PrintWriter;
    import java.util.Scanner;

    class Problem5{
        public static void main(String[] args) throws FileNotFoundException {
            Scanner s = new Scanner(new File("input.txt"));
            int a = s.nextInt();
            StringBuilder even = new StringBuilder();
            StringBuilder uneven = new StringBuilder();
            int bubble;
            int YES = 0;
            for (int i = 0; i < a; i++) {
                bubble = s.nextInt();
                if (bubble % 2 == 0) {
                    even.append(bubble).append(" ");
                    YES++;
                }
                else{
                    uneven.append(bubble).append(" ");
                }
            }
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            if (a!=1) {
                pw.println(uneven.substring(0,uneven.length() - 1));
                pw.println(even.substring(0,even.length() - 1));
            }
            else {
                pw.println(uneven);
                pw.println(even);
            }
            if (a - YES <= YES ){
                pw.print("YES");
            }
            else{
                pw.print("NO");
            }
            pw.close();
        }
    }