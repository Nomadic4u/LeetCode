import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long m = scanner.nextInt();
        long count = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                count = count * a % m;
            }
            b >>= 1;
            a = a * a % m;
        }
        System.out.println(count);
    }
}
