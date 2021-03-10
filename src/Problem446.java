import java.util.LinkedList;
import java.util.Scanner;

class Problem446 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(" ");
        int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);
        char[][] array = new char[a][b];
        byte[][] colors = new byte[a][b];
        String[] rules = new String[8];
        rules[0] = "";
        rules[1] = "B";
        rules[2] = "G";
        rules[3] = "GB";
        rules[4] = "R";
        rules[5] = "RB";
        rules[6] = "RG";
        rules[7] = "RGB";
        for (int i = 0; i < a; i++) {
            array[i] = s.nextLine().toCharArray();
        }
        for (int i = 0; i < a; i++) {
            String[] k = s.nextLine().split(" ");
            for (int j = 0; j < b; j++) {
                colors[i][j] = (byte) Integer.parseInt(k[j]);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!rules[colors[i][j]].contains(String.valueOf(array[i][j])) && array[i][j]!='.') {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}