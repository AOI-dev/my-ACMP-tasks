import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem950 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String str = s.nextLine();
        ArrayList<String> arrl= new ArrayList<>();
        while(str.contains("1")){
            arrl.add(str.substring(0, str.indexOf("1")+1));
            str = str.substring(str.indexOf("1") + 1, str.length());
        }
        for (int i = 0; i < arrl.size(); i++) {
            char output = (char)(arrl.get(i).length() + 96);
            pw.print(output);
        }
        pw.close();
    }
}
