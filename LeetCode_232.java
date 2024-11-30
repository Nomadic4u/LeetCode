import java.util.Stack;

public class LeetCode_232 {
    class MyQueue {
        public static Stack<Integer> stack_1;
        public static Stack<Integer> stack_2;


        public MyQueue() {
            stack_1 = new Stack<>();
            stack_2 = new Stack<>();
        }

        public void push(int x) {
            stack_1.push(x);
        }

        public int pop() {
            stack_2.clear();
            reserse(stack_1, stack_2);
            int num = stack_2.pop();
            stack_1.clear();
            reserse(stack_2, stack_1);
            return num;
        }

        public int peek() {
            if (!stack_2.isEmpty()) {
                return stack_2.peek();
            } else {
                reserse(stack_1, stack_2);
                return stack_2.peek();
            }
        }

        public boolean empty() {
            return stack_1.isEmpty() && stack_2.isEmpty();
        }

        public void reserse(Stack<Integer> stack_1, Stack<Integer> stack_2) {
            Stack<Integer> stack = new Stack<>();
            stack.addAll(stack_1);
            while(!stack.isEmpty())
                stack_2.push(stack.pop());
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
