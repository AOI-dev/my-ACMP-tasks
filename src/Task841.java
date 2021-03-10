import java.util.Scanner;
//https://www.youtube.com/watch?v=Qk8Nb0RbljU
class Task841 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        if (n == 0) System.out.println(1);
        else {
            var res = 2;
            for (int i = 0; i < n; i++) {
                res+=2*i;
            }
            System.out.println(res);
        }
    }
}