import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Task231 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s = sc.nextLine();
        int num = -1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (ch >='0' && ch <= '9') {
                if (num == -1) {
                    num = ch-'0';
                } else {
                    num*=10;
                    num+=ch-'0';
                }
            } else {
                if (num == -1) {
                    builder.append(ch);
                } else {
                    for (int j = 0; j < num; j++) {
                        builder.append(ch);
                    }
                    num = -1;
                }
            }
        }
        for (int i = 1; i <= builder.toString().length(); i++) {
            System.out.print(builder.toString().charAt(i - 1));
            if (i%40==0) {
                System.out.print("\n");
            }
        }

    }
}