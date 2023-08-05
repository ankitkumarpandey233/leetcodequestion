class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            // Check if the sorted string is a key in the HashMap
            // If it's not, create a new entry with the sorted string as the key and a new list as the value
            anagramGroups.putIfAbsent(sorted, new ArrayList<>());

            // Add the current string to the list of values for the sorted string key
            anagramGroups.get(sorted).add(str);
        }

        // Convert the values of the HashMap into a list of lists and return it
        return new ArrayList<>(anagramGroups.values());
    }
        
    }
