class Solution {
    public List<String> topKFrequent(String[] words, int k) {
          // Step 1: Count Frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Step 2: Sort by Frequency and Lexicographical Order
        List<String> sortedWords = new ArrayList<>(frequencyMap.keySet());
        sortedWords.sort((a, b) -> {
            int freqDiff = frequencyMap.get(b) - frequencyMap.get(a);
            if (freqDiff != 0) {
                return freqDiff;
            } else {
                return a.compareTo(b); // Lexicographical order for equal frequencies
            }
        });
        
        // Step 3: Select Top k Strings
        return sortedWords.subList(0, k);
    

    }
}