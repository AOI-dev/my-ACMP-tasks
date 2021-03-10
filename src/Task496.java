import org.w3c.dom.css.CSSPrimitiveValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task496 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        int[] array = new int[n];
        int[] max = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
            if (i>0){
                max[i-1]+=array[i];
                max[i]=array[i]+array[i-1];
            }else{
                max[0] = array[0];
            }
        }
        max[n-1] +=array[0];
        max[0] += array[n-1];
        int maximum=max[0];
        for (int i = 1; i < n; i++) {
            if (maximum<max[i]) maximum=max[i];
        }
        pw.print(maximum);
        pw.close();
    }
}