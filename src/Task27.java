import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Task27 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine();
        int w = Integer.parseInt(st.split(" ")[0]),
                h = Integer.parseInt(st.split(" ")[1]);
        int n = Integer.parseInt(br.readLine());

        boolean[][] matrix = new boolean[w][h];
        for (int i = 0; i < w; i++) {
            Arrays.fill(matrix[i], false);
        }
        for (int i = 0; i < n; i++) {
            int x1, y1, x2, y2;
            st = br.readLine();
            var arr = st.split(" ");
            x1 = Integer.parseInt(arr[0]);
            y1 = Integer.parseInt(arr[1]);
            x2 = Integer.parseInt(arr[2]);
            y2 = Integer.parseInt(arr[3]);
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    matrix[x][y] = true;
                }
            }
        }
        int count = 0;
        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                if (!matrix[x][y]) count++;
            }
        }
        System.out.println(count);

    }
}