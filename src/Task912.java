import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Task912 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n=s.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> color_and_people = new HashMap<>();
        int max = 0;
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (!color_and_people.containsKey(arr[i])) color_and_people.put(arr[i], 1);
            else color_and_people.put(arr[i], color_and_people.get(arr[i]) + 1);
            if (max < color_and_people.get(arr[i])){
                max = color_and_people.get(arr[i]);
                max_num = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (color_and_people.get(arr[i])==max && arr[i]!= max_num) {
                pw.print("0");
                pw.close();
            }
        }
        pw.print(max_num);
        pw.close();
    }
}
