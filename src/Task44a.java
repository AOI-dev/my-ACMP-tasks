import java.io.*;

public class Task44a {
    static final int p = 7;
    private int n = 0;
    private int m = 5;
    private long r = (int) Math.pow(2, 16);

    private long hash(String w, int a, int b) {
        long key = 0;
        for (int i = a; i < b; i++) {
            key+= Math.pow(p, i) * w.charAt(i);
        }
        return key % r;
    }

    private int hash(String w, int a) {
        return w.charAt(a);
    }


    private long rabinKarp(String w, String s) {
        n = s.length();
        m = w.length();
        long hashS = hash(s,0,m - 1);
        long hashW = hash(w,0,m - 1);
        System.out.println(hashW);
        int answer = 0;
        for (int i = 0; i < n - m; i++) {
            if (hashS == hashW)
                answer++;
            hashS = (int) ((p * hashS - Math.pow(p, m) *  hash(s, i) + hash(s,i + m)) % r);
            System.out.println(hashS);
        }
        return answer;
    }
        public static void main (String[] args) throws IOException {
        Task44a pr = new Task44a();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            StringBuilder s = new StringBuilder();
            while (bufferedReader.ready()) {
                s.append(bufferedReader.readLine());
            }
            FileWriter fw = new FileWriter("output.txt");
            fw.write(s.toString());
            fw.flush();
            fw.close();
            bufferedReader.close();
            System.out.println(pr.rabinKarp("<--<<", s.toString()));
            System.out.println(pr.rabinKarp(">>-->", s.toString()));

    }
}
