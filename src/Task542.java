import java.util.Scanner;

// TODO: 06.03.2021 РљСЂСѓС‚Р°СЏ Р·Р°РґР°С‡Р°. РџРѕРјРѕРіР°РµС‚ СЂР°Р·РѕР±СЂР°С‚СЊСЃСЏ СЃ Р±РёС‚РѕРІС‹РјРё РѕРїРµСЂР°С†РёСЏРјРё
class Task542 {
    private static int B(int m) {
        var result = 0;
        result |= m % 2;
        m /= 2;
        while (m > 0) {
            result<<=1;
            result |= (m % 2);
            m /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var m = s.nextInt();
        System.out.println(B(m));
    }
}