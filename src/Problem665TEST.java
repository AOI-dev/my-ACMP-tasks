import java.util.Scanner;

class Problem665TEST {
    static boolean isPalindrome(String s){
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
    public static void main(String[] args) {
        for (int i = 0; i<24; i++) {
            String a;
            if (i >= 10) {
                a = String.valueOf(i);
            } else {
                a = "0" + i;
            }
            for (int j = 0; j < 60; j++) {
                String b;
                if (j >= 10) {
                    b = String.valueOf(j);
                } else {
                    b = "0" + j;
                }
                if (isPalindrome(a + b)) {
                    System.out.println(a +":"+ b);
                }
            }
        }
    }
}
