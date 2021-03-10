import java.util.Scanner;

class Problem392 {
    static int[] cyclicShift(int[] array) {
        var result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i] = array[i - 1];
        }
        result[0] = array[array.length - 1];
        return result;
    }
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var n = s.nextInt();
        var array = new int[n];
        var min = 0;
        var min_i = -1;
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
            if (min==0 || array[i] < min) {
                min = array[i];
                min_i = i;
            }
        }
        for (int i = 0; i < n - min_i; i++) {
            array = cyclicShift(array);
        }
        for (int c : array) {
            System.out.print(c + " ");
        }

    }
}