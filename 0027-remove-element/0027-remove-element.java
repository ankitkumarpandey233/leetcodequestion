class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0; // Keeps track of the index where non-val elements should be placed

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    
    }
}