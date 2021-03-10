import java.util.Scanner;

class Task163 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var string = new char[5];
        string = sc.nextLine().toCharArray();
        if (string[1] =='+') {
            if (string[0] == 'x') {
                System.out.println(string[4] - string[2]);
            } else if (string[2] == 'x') {
                System.out.println(string[4] - string[0]);
            } else if (string[4] == 'x') {
                System.out.println(string[0] + string[2] - 2*'0');
            }
        } else {
            if (string[0] == 'x') {
                System.out.println(string[4] + string[2] - 2*'0');
            }else if (string[2] == 'x') {
                System.out.println(string[0] - string[4]);
            } else if (string[4] == 'x') {
                System.out.println(string[0] - string[2]);
            }
        }
    }


}