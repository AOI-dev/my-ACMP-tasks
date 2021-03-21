import java.util.Scanner;


class Task785 {
    static String isAutomorphic(int i) {
        if (String.valueOf((long)i*i).endsWith(String.valueOf(i)))
            return i+"\n";
        else return "";
    }
    static void howManyAutomorphic() {
        for (int j = -1000000; j <= 1000000; j++) {
            System.out.print(isAutomorphic(j));
        }
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int[] arr = {1, 5, 6, 25, 76, 376, 625, 9376, 90625, 109376, 890625};
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}