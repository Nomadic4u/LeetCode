public class LeetCode_88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] count = new int[n + m];
            int index = 0, i = 0, j = 0;
            for (i = 0, j = 0; i < m && j < n; ) {
                if (nums1[i] < nums2[j]) {
                    count[index++] = nums1[i++];
                } else {
                    count[index++] = nums2[j++];
                }
            }
            while (i < m) {
                count[index++] = nums1[i++];
            }
            while (j < n) {
                count[index++] = nums2[j++];
            }

            for (int k = 0; k < m + n; k++) {
                nums1[k] = count[k];
            }
        }
    }
}
