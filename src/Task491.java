import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task491 {
    private static boolean isOnlyOneSymbol(String s) {
        boolean oneSymbol = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) oneSymbol = false;
        }
        return oneSymbol;
    }

    private static boolean isPalindrome(String s){
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - i - 1;
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine();

        if (isOnlyOneSymbol(st)) {
            System.out.println("NO SOLUTION");
            return;
        }

        if (isPalindrome(st)) {
            System.out.println(st.substring(0, st.length()-1));
        } else {
            System.out.println(st);
        }
    }
}