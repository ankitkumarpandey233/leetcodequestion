class Solution {
   public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }
    
    String prefix = strs[0]; // Initialize the prefix with the first string
    
    // Iterate through the rest of the strings
    for (int i = 1; i < strs.length; i++) {
//check if the string is in the value
        while (!strs[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
        }
    }
    
    return prefix;
}
}
