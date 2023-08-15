class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        

        Map<Integer, List<Integer>> frequencyGroup = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            frequencyGroup.putIfAbsent(frequency, new ArrayList<>());
            frequencyGroup.get(frequency).add(num);
        }
        

        List<Integer> result = new ArrayList<>();
        for (int freq = nums.length; freq > 0 && result.size() < k; freq--) {
            if (frequencyGroup.containsKey(freq)) {
                result.addAll(frequencyGroup.get(freq));
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}