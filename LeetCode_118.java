import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(0);
            list1.add(1);
            list1.add(0);
            List<List<Integer>> res = new ArrayList<>();
            res.add(list1);
            List<Integer> last = new ArrayList<>();
            last = list1;
            for(int i = 2; i <= numRows; i ++) {
                List<Integer> list2 = new ArrayList<>();
                list2.add(0);
                int len = last.size();
                for(int j = 0; j < len - 1; j ++) {
                    list2.add(last.get(j) + last.get(j + 1));
                }
                list2.add(0);
                res.add(list2);
                last = list2;
            }
            for(int i =0; i < res.size(); i ++) {
                res.get(i).remove(res.get(i).size() - 1);
                res.get(i).remove(0);
            }
            return res;
        }
    }
}
