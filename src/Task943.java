import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task943 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int N = s.nextInt();
        int M = s.nextInt();
        int Y = s.nextInt();
        int X = s.nextInt();
        if (Y % 2 == 1){            //СЃР»РµРІР° РЅР°РїСЂР°РІРѕ
            pw.print(M*Y-M+X-1);
        }else{                      //СЃРїСЂР°РІР° РЅР°Р»РµРІРѕ
            pw.print(M*Y - M + (M - X));
        }
        pw.close();
    }
}
