import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        String str = s.nextLine();
        int max = 0;
        int i = 1;
        while(true){
            StringBuilder find = new StringBuilder();
            for (int j = 0; j < i; j++) {
                find.append("0");
            }
            System.out.println(find);
            if (str.contains(find.toString())) {
                max = i;
                i++;
            }else break;
        }
        pw.print(max);
        pw.close();
    }
}
