import java.util.*;

class Task274 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var n = Integer.parseInt(s.nextLine());
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i < n; i++) {
            var str = s.nextLine().split(" ");
            var a = String.valueOf(str[0]).toCharArray();
            var b = String.valueOf(str[1]).toCharArray();
            Set<Character> aSet = new HashSet<>();
            for (var c:a) {
                aSet.add(c);
            }
            Set<Character> bSet = new HashSet<>();
            for (var c:b) {
                bSet.add(c);
            }
            if (aSet.size() == bSet.size() && aSet.containsAll(bSet)) {
                builder.append("YES\n");
            } else {
                builder.append("NO\n");
            }
        }
        System.out.println(builder.toString());
    }
}
