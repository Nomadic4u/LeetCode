import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        long n = (long) st.nval;
        int temp = 0;
        for (int i = 0; i < n; i++){
            st.nextToken();
            temp = (int) st.nval;
        }
        st.nextToken();
        long m = (long) st.nval;
        for (int i = 0; i < m; i++){
            st.nextToken();
            temp = (int) st.nval;
        }
        System.out.println(n * m);
    }
}