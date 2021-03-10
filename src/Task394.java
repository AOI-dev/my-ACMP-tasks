import java.util.Scanner;

class Task394 {
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
        var n = s.nextInt(); //С‡РёСЃР»Рѕ РґСЂСѓР·РµР№
        var m = s.nextInt(); //С‡РёСЃР»Рѕ Р°РїРµР»СЊСЃРёРЅРѕРІ
        //С‡РёСЃР»Рѕ РґРѕР»РµРє * m РґРѕР»Р¶РЅРѕ Р±С‹С‚СЊ РєСЂР°С‚РЅРѕ С‡РёСЃР»Сѓ РґСЂСѓР·РµР№
        var gcd = gcd(n, m);
        System.out.println(n/gcd(m,n));
        }
}