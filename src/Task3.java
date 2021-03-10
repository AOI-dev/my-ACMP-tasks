import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int a = s.nextInt();
        int b = (a / 10)*(a / 10 + 1);
String answer ="";
	if (b ==0)  answer = "25";
else answer = b + "25";
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.print(answer);
        pw.close();
    }
}