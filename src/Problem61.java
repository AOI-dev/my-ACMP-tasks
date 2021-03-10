import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem61 {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
        }
        int first_team = 0, second_team = 0;
        int current_element_index = 0;
        while(s.hasNext()){
            int current_element = s.nextInt();
            if (current_element_index % 2 == 0){
                first_team+=current_element;
            }else{
                second_team+=current_element;
            }
            current_element_index ++;
        }
        if (first_team > second_team) pw.print(1);
        else if (first_team < second_team) pw.print(2);
        else pw.print("DRAW");
        pw.close();
    }
}
