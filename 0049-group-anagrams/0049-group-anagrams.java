class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            anagramGroups.putIfAbsent(sorted, new ArrayList<>());
            anagramGroups.get(sorted).add(str);
        }
        return new ArrayList<>(anagramGroups.values());
    }
        
}
