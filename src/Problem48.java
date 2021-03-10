import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.print(1);
        for (int i = line.length() - 1; line.charAt(i) == '0'; i--) {
            System.out.print(0);
        }

    }
}
