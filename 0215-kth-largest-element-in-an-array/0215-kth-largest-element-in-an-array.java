class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int e= n-k;
        System.out.println(e);
        return nums[e];
    }
}