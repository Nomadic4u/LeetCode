import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        boolean[][] str = new boolean[n][n];
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        str[i][j] = true;
                        res = Math.max(res, j - i + 1);
                    } else if (str[i + 1][j - 1]) {
                        str[i][j] = true;
                        res = Math.max(res, j - i + 1);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
