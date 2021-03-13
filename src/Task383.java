import java.util.Scanner;

class Task383 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long a = sc.nextInt();
        for (int i = 1; i <= 1000000; i++) {
            String st = String.valueOf(i);
            var sum = 0;
            for (var c : st.toCharArray()) {
                sum += c - '0';
            }

            if (sum % String.valueOf(i).length() == 0)
                a--;
            if (a==0) {
                System.out.println(i);
                break;
            }
        }


    }
}