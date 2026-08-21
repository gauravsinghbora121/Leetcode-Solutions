class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0; // pointer for nums1
        int j = 0; // pointer for nums2

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                i++;
            } else {

                // Shift elements to the right
                for (int k = m - 1; k >= i; k--) {
                    nums1[k + 1] = nums1[k];
                }

                // Insert nums2[j] into nums1
                nums1[i] = nums2[j];

                i++;
                j++;
                m++; // nums1 now has one more valid element
            }
        }

        // Copy remaining elements from nums2
        while (j < n) {
            nums1[m] = nums2[j];
            m++;
            j++;
        }
    }
}