import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

class Task7{
    public static void main(String[] args){
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] words = s.nextLine().split("\\s");
        BigDecimal a = new BigDecimal(words[0]);
        BigDecimal b = new BigDecimal(words[1]);
        BigDecimal c = new BigDecimal(words[2]);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (a.compareTo(b)>=0 && a.compareTo(c)>=0){
            pw.print(a);
        }
        else {
            if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
                pw.print(b);
            }else{
                    pw.print(c);
            }
        }
        pw.close();
    }
}