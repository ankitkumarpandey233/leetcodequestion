class Solution
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) 
        {
            numbers.add(num);
        }
        
        List<Integer> missing = new ArrayList<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) 
        {
            if (!numbers.contains(i)) 
            {
                missing.add(i);
            }
        }
        
        return missing;
    
    }
}