class Solution {
    public int singleNumber(int[] nums) {
        int no=0;
        for(int i=0;i<nums.length;i++){
            no^=nums[i];
        }
        return no;
    }
}