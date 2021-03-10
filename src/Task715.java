import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task715 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int n=s.nextInt(), m=s.nextInt();
        s.nextLine();
        StringBuilder original= new StringBuilder();
        StringBuilder negative= new StringBuilder();
        for (int i = 0; i < n; i++) {
            String temp = s.nextLine();
            System.out.println(temp);
            original.append(temp);
        }
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = s.nextLine();
            System.out.println(temp);
            negative.append(temp);
        }
        int counter=0;
        System.out.println(original);
        System.out.println(negative);
        for (int i = 0; i < m*n; i++) {
            if (original.charAt(i)==negative.charAt(i)) counter++;
        }
        pw.print(counter);
        pw.close();
    }
}
