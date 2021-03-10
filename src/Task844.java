import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Task844 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        long a = s.nextInt(), b =s.nextInt();
        {
            long buff = a;
            a = b;
            b = buff;
        }
        while(true){
            b+=1;
            a-=1;
            if (b == a){
                System.out.println(a);
            }
            if (b>a){

            }
            break;
        }
        pw.print("ff");
        pw.close();
    }
}
