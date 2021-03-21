import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Task47 {
    private static ArrayList<Integer> dividers(int n) {
        ArrayList<Integer> divs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                divs.add(i);
        }
        return divs;
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> dividers = dividers(n);
        ArrayList<Integer> sums = new ArrayList<>(dividers.size());

        for(var num : dividers) {
            int sum = 0;
            for (var ch : String.valueOf(num).toCharArray()) {
                sum += ch - '0';
            }
            sums.add(sum);
        }

        int max = 0;
        int el = 0;
        for (int i = 0; i < sums.size(); i++) {
            if (sums.get(i) > max) {
                max = sums.get(i);
                el = i;
            }
        }
        System.out.println(dividers.get(el));
    }
}