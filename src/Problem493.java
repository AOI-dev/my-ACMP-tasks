import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem493 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        int a = s.nextInt();
        int b = s.nextInt();
        char[][] arr = new char[a][b];
        int iterator =0;
        String che = s.nextLine();
        for (int i = 0; i < a; i++) {
            String buff = s.nextLine();
            System.out.println(buff);
            for (int j = 0; j < b; j++) {
                arr[i][j] = buff.charAt(j);
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                boolean yes = true;
                if (arr[i][j] =='.'){
                    try {
                        if (arr[i - 1][j] == '*') {
                                yes=false;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    try {
                        if (arr[i + 1][j] == '*') {
                            yes=false;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    try {
                        if (arr[i][j + 1] == '*') {
                            yes=false;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    try {
                        if (arr[i][j - 1] == '*') {
                            yes=false;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    if(yes) iterator++;
                }

            }
        }
        pw.print(iterator);
        pw.close();
    }
}
