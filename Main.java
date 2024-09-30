import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int res = 0;
        while (n != m && Math.min(n, m) != 1) {
            res += Math.min(n, m);
            int last = Math.max(n, m) - Math.min(n, m);
//            System.out.println(last);
            int now = Math.min(n, m);
            n = Math.min(last, now);
            m = Math.max(last, now);
        }
        res += Math.max(n, m);
        System.out.println(res);
    }
}
