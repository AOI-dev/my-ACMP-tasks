import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Task522 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }

        System.out.println(set1.containsAll(set2) && set2.containsAll(set1) ? 1 : 0);
    }
}