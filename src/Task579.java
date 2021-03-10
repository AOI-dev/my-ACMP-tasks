import java.util.Scanner;

class Task579 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var n = s.nextInt();
        var arr = new int[n];
        int posSum = 0, negSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] < 0) {
                negSum+=arr[i];
            } else {
                posSum+=arr[i];
            }
        }
        var count = 0;
        negSum= -negSum;
        for (int i = 0; i < n; i++) {
            if (posSum > negSum) {
                if (arr[i] >0)
                    count++;
            } else {
                if (arr[i] <0)
                    count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if (posSum > negSum) {
                if (arr[i] >0)
                    System.out.print(i + 1 + " ");
            } else {
                if (arr[i] <0)
                    System.out.print(i + 1 + " ");
            }
        }
    }
}