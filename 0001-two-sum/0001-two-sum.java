class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        int n = nums.length;

      
        for (int i = 0; i < n; i++) {
            num.put(nums[i], i);
        }

   
        for (int i = 0; i < n; i++) {
            int diffrence  = target - nums[i];
            if (num.containsKey(diffrence ) && num.get(diffrence ) != i) {
                return new int[]{i, num.get(diffrence )};
            }
        }

        return new int[]{};
    }
}