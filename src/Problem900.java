import java.util.Scanner;

public class Problem900 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int Peta = n * 65/120 , Vasa = n * 20 / 120, Kola= n * 35 / 120;
        System.out.println(Peta+ " " + Vasa + " "+ Kola);
    }
}
