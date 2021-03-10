import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task294 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int k1= s.nextInt();
        int l1= s.nextInt();
        int m1= s.nextInt();
        int k2= s.nextInt();
        int l2= s.nextInt();
        int m2= s.nextInt();
        int bilo;
        if (k1>k2) bilo = k1*m1 + k2*m2;
        else bilo = k1*m1 + k2*m2;
        int stalo;
        int ush1 = k1*l1/100;
        int ush2 = k2*l2/100;
        if (k1 - ush1 > k2 - ush2)
        stalo = (k2 - ush2)*(m1 + m2);
        else stalo = (k1 - ush1)*(m1 + m2);
        System.out.println(stalo);
        System.out.println(bilo);
        pw.print(bilo-stalo);
        pw.close();
    }
}
