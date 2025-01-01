import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Integer> solution(List<Integer> a, List<Integer> b) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer count : a) {
            if(b.contains(count))
                list.add(count);
        }
        Collections.sort(list, (x, y) -> y - x);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solution(Arrays.asList(1, 2, 3, 7), Arrays.asList(2, 5, 7)).equals(Arrays.asList(7, 2)));
        System.out.println(solution(Arrays.asList(1, 4, 8, 10), Arrays.asList(2, 4, 8, 10)).equals(Arrays.asList(10, 8, 4)));
        System.out.println(solution(Arrays.asList(3, 5, 9), Arrays.asList(1, 4, 6)).equals(Collections.emptyList()));
        System.out.println(solution(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)).equals(Arrays.asList(3, 2, 1)));
    }
}