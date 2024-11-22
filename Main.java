import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++)
            arr[i] = scanner.nextInt();
        quick_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i ++)
            System.out.println(arr[i]);
    }

    public static void quick_sort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int l = left - 1;
        int r = right + 1;
        int num = arr[(left + right) / 2];
        while (l < r) {
            int mid = (l + r) / 2;
            do {
                l++;
            } while (arr[l] > num);
            do {
                r--;
            } while (arr[r] < num);

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        quick_sort(arr, left, r);
        quick_sort(arr, r + 1, right);
    }
}