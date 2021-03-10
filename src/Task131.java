import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
class Zhilets{
    public Zhilets(int age, byte gender) {
        this.age = age;
        this.gender = gender;
    }
    public int age;
    public byte gender;
}
public class Task131 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n = s.nextInt();
        ArrayList<Zhilets> LIST = new ArrayList<>();
        boolean isThereAtLeastOneMan = false;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            LIST.add(new Zhilets(a, (byte) b));
            if (b == 1) isThereAtLeastOneMan=true;
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (LIST.get(i).age > max && LIST.get(i).gender == 1) {
                max = LIST.get(i).age;
                index = i;
            }
        }
        if (isThereAtLeastOneMan) pw.print(++index);
        else pw.print("-1");

        pw.close();
    }
}
