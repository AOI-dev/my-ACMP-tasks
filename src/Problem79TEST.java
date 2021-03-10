import java.util.ArrayList;

public class Problem79TEST {
    //Каким может быть максимальный цикл последних цифр числа возводимого a в некоторую степень b?
    // вывод: 4
    static final int NUMERAL_SYSTEM = 15;
    public static void calc(long a, long b) {
        ArrayList<Long> list = new ArrayList<>();
        long buff = a % NUMERAL_SYSTEM;
        while(!list.contains(buff)){
            list.add(buff);
            buff *= a % NUMERAL_SYSTEM;
            buff %= NUMERAL_SYSTEM;
        }
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                calc(i,j);
            }
        }
    }
}
