import java.util.Scanner;

class Problem665 {
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
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] ar =str.split(":");
        int hh = Integer.valueOf(ar[0]), mm = Integer.valueOf(ar[1]);
        boolean flag = true;
        int[][] arr = new int[16][2];
        int index =0;
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
                    arr[index][0] = i;
                    arr[index][1] = j;
                    index++;
                }
            }
        }
        for (int i = 0;; i++, i%=arr.length) {
            String a;
            if (arr[i][0] >= 10) {
                a = String.valueOf(arr[i][0]);
            } else {
                a = "0" + arr[i][0];
            }
            String b;
            if (arr[i][1] >= 10) {
                b = String.valueOf(arr[i][1]);
            } else {
                b = "0" + arr[i][1];
            }
            if (arr[i][0] > hh || (arr[i][0] == hh && arr[i][1] > mm)) {
                System.out.println(a + ":" + b);
                break;
            } else if (i == index - 1) {
                System.out.println("00:00");
                break;
            }
        }
//        if (hh >= 10) {
//            a = String.valueOf(hh);
//        } else {
//            a = "0" + hh;
//        }
//        for (int j = mm; j < 60; j++) {
//            String b;
//            if (j >= 10) {
//                b = String.valueOf(j);
//            } else {
//                b = "0" + j;
//            }
//            if (isPalindrome(a + b)) {
//                System.out.println(a +":"+ b);
//                flag = false;
//            }
//        }

//        for (int i = hh + 1; flag; i++, i %=24) {
//            if (i >= 10) {
//                a = String.valueOf(i);
//            } else {
//                a = "0" + i;
//            }
//            for (int j = 0; j < 60; j++) {
//                String b;
//                if (j >= 10) {
//                    b = String.valueOf(j);
//                } else {
//                    b = "0" + j;
//                }
//                if (isPalindrome(a + b) && (i!=hh && j!=mm)) {
//                    System.out.println(a +":"+ b);
//                    flag = false;
//                }
//            }
//        }
    }
}
