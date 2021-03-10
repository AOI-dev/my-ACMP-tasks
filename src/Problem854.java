import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Problem854 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int troom = s.nextInt();
        int tcond = s.nextInt();
        String regime = s.next();
        switch(regime){
            case("auto"):{
                pw.print(tcond);
                break;
            }
            case("freeze"):{
                if (troom > tcond)pw.print(tcond);
                else pw.print(troom);

                break;
            }
            case("heat"):{
                if (troom < tcond)pw.print(tcond);
                else pw.print(troom);
                break;
            }
            case("fan"):{
                pw.print(troom);
                break;
            }
        }
        pw.close();
    }
}