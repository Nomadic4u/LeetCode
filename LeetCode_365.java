public class LeetCode_365 {
    class Solution {
        public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
            if(jug1Capacity+ jug2Capacity < targetCapacity) {
                return false;
            } else if(jug1Capacity == 0 || jug2Capacity == 0) {
                return targetCapacity == 0 || jug2Capacity + jug1Capacity == targetCapacity;
            } else {
                return targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0;
            }
        }
        public int gcd(int x, int y) {
            int remainder = x % y;
            while(remainder != 0) {
                x = y;
                y = remainder;
                remainder = x % y;
            }
            return y;
        }
    }
}
