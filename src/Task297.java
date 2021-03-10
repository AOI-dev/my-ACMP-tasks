import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task297 {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner s = new Scanner(new FileReader("input.txt"));
    PrintWriter pw = new PrintWriter("output.txt");
    String str = s.nextLine();
    int quantity = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case '6':{
                    quantity++;
                    break;
                }
                case '8':{
                    quantity++;
                    quantity++;
                    break;
                }
                case '9':{
                    quantity++;
                    break;
                }
                case '0':{
                    quantity++;
                    break;
                }
            }
        }
        pw.print(quantity);
        pw.close();

    }
}