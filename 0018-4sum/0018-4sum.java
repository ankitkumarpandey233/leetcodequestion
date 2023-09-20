class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> store = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int ls = j + 1, rs = n - 1;
                while (ls < rs) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[ls] + (long) nums[rs];
                    if (sum == target) {
                        store.add(Arrays.asList(nums[i], nums[j], nums[ls], nums[rs]));
                        while (ls < rs && nums[ls] == nums[ls + 1]) ls++;
                        while (ls < rs && nums[rs] == nums[rs - 1]) rs--;
                        ls++;
                        rs--;
                    } else if (sum < target) ls++;
                    else rs--;
                }
            }
        }

        return store;
    
}
}