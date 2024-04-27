import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        Scanner scanner = new Scanner(System.in);
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int k = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        List<Double> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[k];
            for (int j = 0; j < k; j++) {
                st.nextToken();
                arr[j] = (int) st.nval;
            }
            Arrays.sort(arr);
            int sum = Arrays.stream(arr).sum();
            sum -= arr[0];
            sum -= arr[k - 1];
            Double d = (sum * 1.0) / (k - 2);
            list.add(d);
        }
        Collections.sort(list);
//        System.out.println(list);
        for (int i = 0; i < m; i++) {
            System.out.printf("%.3f", list.get(n - m + i));
            if (i != m - 1)
                System.out.printf(" ");
            else
                System.out.println();
        }
    }
}
