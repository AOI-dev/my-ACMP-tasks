import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String a=s.nextLine();
        int x = Integer.valueOf(String.valueOf(a.charAt(1)));
        int y = 0;
        switch(a.charAt(0)){
            case 'A':{
                y = 1;
                break;
            }
            case 'B':{
                y = 2;
                break;
            }
            case 'C':{
                y = 3;
                break;
            }
            case 'D':{
                y = 4;
                break;
            }
            case 'E':{
                y = 5;
                break;
            }
            case 'F':{
                y = 6;
                break;
            }
            case 'G':{
                y = 7;
                break;
            }
            case 'H':{
                y = 8;
                break;
            }
        }

        if ((x + y)%2==0){
            pw.print("BLACK");

        }else pw.print("WHITE");

        pw.close();
    }
}
