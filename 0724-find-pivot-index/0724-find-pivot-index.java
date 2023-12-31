class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int Sum = 0;
        for (int num : nums) 
        {
            Sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (leftSum == Sum - leftSum - nums[i]) 
            {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
        
}
