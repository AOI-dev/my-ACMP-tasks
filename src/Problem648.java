import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Probolem648 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        Integer.valueOf(br.readLine());
        String str = br.readLine();
        var a = str.split(" ");
        int [] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(array);
        int shrek = 0, krupie = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length / 2) {
                shrek += array[i];
            } else {
                krupie += array[i];
            }
        }
        System.out.println(shrek - krupie);
    }
}