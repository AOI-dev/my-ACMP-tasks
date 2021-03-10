import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        if (line.length() == 5 &&
                line.charAt(2) == '-' &&
                (line.charAt(0) >= 'A' && line.charAt(0) <= 'H') &&
                (line.charAt(3) >= 'A' && line.charAt(3) <= 'H') &&
                (line.charAt(1) > '0' && line.charAt(1) < '9') &&
                (line.charAt(4) > '0' && line.charAt(4) < '9')) {
            int x1 = line.charAt(0) - 'A', y1 = line.charAt(1) - '0';
            int x2 = line.charAt(3) - 'A', y2 = line.charAt(4) - '0';
            if ((Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) || (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
