    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.PrintWriter;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Problem10 {
        public static void main(String[] args) throws FileNotFoundException {
           Scanner s = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter(new File("output.txt"));
           long A = s.nextInt();
            long B = s.nextInt();
            long C = s.nextInt();
            long D = s.nextInt();
           boolean isFirst = true;
           int[] array = new int[]{101,101,101};

           int i=0;
            for (int x = -100; x <= 100; x++) {
                if (A*x*x*x + B*x*x + C*x + D == 0) {
                    array[i] = x;
                    i++;
                }
            }
            Arrays.sort(array);
            for (int j = 0; j < 3; j++) {
                if (array[j]!=101){
                    if (isFirst) {
                        pw.print(array[j]);
                        isFirst = false;
                    }
                    else pw.print(" " + array[j]);
                }
            }

           pw.close();
        }
    }