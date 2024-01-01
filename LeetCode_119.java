import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(0);
            list1.add(1);
            list1.add(0);
            List<Integer> last = new ArrayList<>();
            last = list1;
            for(int i = 1; i <= rowIndex; i ++) {
                List<Integer> list2 = new ArrayList<>();
                list2.add(0);
                int len = last.size();
                for(int j = 0; j < len - 1; j ++) {
                    list2.add(last.get(j) + last.get(j + 1));
                }
                list2.add(0);
//                if(i == rowIndex)
//                    break;
                last = list2;
            }
            last.remove(0);
            last.remove(last.size() - 1);
            return last;
        }
    }
}
