class Solution {
    public int[] twoSum(int[] nums, int target) {
        final int N = nums.length;
        int[] A = new int[2];
        for(int i=0;i<N; i++)
        {  // Valid answer must be there before end of loop
            for(int j=i+1; j < N; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    A[0] = i; A[1] = j;
                    return A;
                }
            }
        }
        return A;
    }
}