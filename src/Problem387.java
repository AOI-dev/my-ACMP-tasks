import java.util.Scanner;

class Problem387 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int counter = 0;
        String str;
        for (int i = 0; i < n; i++) {
            str = s.nextLine();
            String[] arr;
            arr = str.split("->");
            if (arr[1].indexOf(arr[0]) == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}