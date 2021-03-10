import java.util.Scanner;

class Problem394 {
    private static int gcd (int a, int b) {
    while (b > 0) {
        a %= b;
        var bubble = b;
        b = a;
        a = bubble;
    }
    return a;
}
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var n = s.nextInt(); //число друзей
        var m = s.nextInt(); //число апельсинов
        //число долек * m должно быть кратно числу друзей
        var gcd = gcd(n, m);
        System.out.println(n/gcd(m,n));
        }
}