import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//class DotIndex {
//    private int i, j;
//    DotIndex(int i, int j){
//        this.i = i;
//        this.j = j;
//    }
//    public int getI() {
//        return i;
//    }
//
//    public int getJ() {
//        return j;
//    }
//}

public class Task895 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        char[][] square = new char[3][3];
//        ArrayList<DotIndex> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String line = s.nextLine();
            for (int j = 0; j < 3; j++) {
                square[i][j] = line.charAt(j);
//                if (square[i][j] == '.'){
//                    arr.add(new DotIndex(i,j));
//                }
            }
        }
        System.out.println(checkWinner(square));
        //РјР°СЃСЃРёРІ РёРЅРґРµРєСЃРѕРІ СЌР»РµРјРµРЅС‚РѕРІ-С‚РѕС‡РµРє
        char winner = checkWinner(square);
        switch (winner) {
            case 'D':{
                pw.print("Draw");
            break;
            }
            case 'X':{
                pw.print("Win");
                break;
            }
            case 'O':{
                pw.print("Lose");
                break;
            }
        }
        pw.close();
    }



    public static char checkWinner(char[][] array){
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array [i][1] && array[i][0] == array [i][2]){
                if (array[i][0] =='X'){
                    return 'X';
                }else{
                    return 'O';
                }
            }
            if (array[0][i] == array [1][i] && array[0][i] == array [2][i]){
                if (array[0][i] =='X'){
                    return 'X';
                }else{
                    return 'O';
                }
            }
        }


        if (array[0][0] == array [1][1] && array[1][1] == array [2][2]){
            if (array[0][0] =='X'){
                return 'X';
            }else{
                return 'O';
            }
        }
        if (array[0][2] == array [1][1] && array[1][1] == array [2][0]){
            if (array[0][2] =='X'){
                return 'X';
            }else{
                return 'O';
            }
        }
        return 'D';
    }
}
