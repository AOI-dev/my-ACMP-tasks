import java.util.Scanner;

class Task716 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] d = new double[n];
        var str = sc.nextLine();
        d[0] = Double.parseDouble(str);
        double inf = 30, sup = 4000;
        for (int i = 1; i < n; i++) {
            str = sc.nextLine();
            d[i] = Double.parseDouble(str.split(" ")[0]);
            double v = (d[i] + d[i-1]) / 2;
            if (str.contains("closer")) {
                if (d[i] > d[i-1]) {
                    inf = Math.max(inf, v);
                }
                if (d[i] < d[i-1]) {
                    sup = Math.min(sup, v);
                }
            } else if (str.contains("further")) {
                if (d[i] > d[i-1]) {
                    sup = Math.min(sup, v);
                }
                if (d[i] < d[i-1]) {
                    inf = Math.max(inf, v);
                }
            }
        }

        System.out.println(inf + " " + sup);
    }
}