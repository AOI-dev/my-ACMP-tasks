import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Task8{
    public static void main(String[] args){
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (a * b == c){
        pw.print("YES");
        }
        else pw.print("NO");
        pw.close();
    }
}