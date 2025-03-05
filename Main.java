import java.util.HashMap;

public class Main {
    public static int solution(int n, int l, int r, int[] a) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if(a[i] % 2 == 0 && a[i] >= l && a[i] <= r)
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 8, new int[]{1, 2, 6, 8, 7}) == 2);
        System.out.println(solution(4, 10, 20, new int[]{12, 15, 18, 9}) == 2);
        System.out.println(solution(3, 1, 10, new int[]{2, 4, 6}) == 3);
    }

    class Solution {
        public int hIndex(int[] citations) {
            HashMap<Integer, Integer> map = new HashMap();
            for (int i = 0; i < citations.length; i ++) {
                map.put(citations[i], map.getOrDefault(citations[i], 0) + 1);
            }

            int count = citations.length;

            while (true) {
                if((map.containsKey(count) && count <= map.get(count)) || count == 0) {
                    return count;
                }
                count --;
            }
        }
    }
}