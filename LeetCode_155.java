public class LeetCode_155 {
    class MinStack {

        int[] arr;
        int index = 0;
        int[] min_count;
        int index_min = 0;


        public MinStack() {
            arr = new int[30000];
            min_count = new int[30000];
        }

        public void push(int val) {
            arr[index++] = val;
            if (index_min == 0 || min_count[index_min - 1] >= val)
                min_count[index_min++] = val;
        }

        public void pop() {
            int val = arr[--index];
            if (val == min_count[index_min - 1])
                index_min--;
        }

        public int top() {
            return arr[index - 1];
        }

        public int getMin() {
            return min_count[index_min - 1];
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
