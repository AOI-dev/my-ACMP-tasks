import java.util.HashSet;
import java.util.Scanner;
public class Problem440 {
    static class pair{
        int x, y;
        pair (int x, int y){
            this.x= x;
            this.y= y;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<pair> set = new HashSet<pair>();
//        int x[] = new int[5];
//        int y[] = new int[5];
        int[] x_target = new int[5];
        x_target[0] = 0;
        x_target[1] = 25;
        x_target[2] = 50;
        x_target[3] = 75;
        x_target[4] = 100;
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            pair p = new pair(s.nextInt(), s.nextInt());
            if (!set.contains(p)) set.add(p);

        }
        System.out.println(set.size());
        for (pair p:set) {
            int x = p.x;
            int y = p.y;
            for (int j = 0; j < 5; j++) {
                if (Math.sqrt(Math.pow(x - x_target[j], 2) +  Math.pow(y, 2)) < 10) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
