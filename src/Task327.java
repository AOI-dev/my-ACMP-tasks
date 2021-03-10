import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task327 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = Integer.valueOf(s.nextLine());
        String str;
        for (int i = 0; i < n; i++) {
            str = s.nextLine();
//            String str_next = String.valueOf(Integer.valueOf(str) - 1);
//            String str_previous = String.valueOf(Integer.valueOf(str) + 1);
            String str_last_next = String.valueOf(Integer.valueOf(str.substring(3,6)) + 1);
            String str_last_previous = String.valueOf(Integer.valueOf(str.substring(3,6)) - 1);
            String str_first_next = str.substring(0,3);
            if (str_last_next =="1000") {
                str_first_next = String.valueOf(Integer.valueOf(str.substring(0,3)) + 1);
                str_last_next ="000";
            }
            String str_first_previous = str.substring(0,3);
            if (str_last_previous =="-1") {
                str_first_previous = String.valueOf(Integer.valueOf(str.substring(0,3))-1);
                str_last_previous ="999";
            }
            if (count(str_first_next) == count(str_last_next) || count(str_first_previous) == count(str_last_previous)) pw.println("Yes");
            else pw.println("No");
        }
            pw.close();

    }
    static int count(String buff) {
        int result = 0;
        for (int i = 0; i < buff.length(); i++) {
            result += Integer.valueOf(String.valueOf(buff.charAt(i)));
        }
        return result;
    }
}
