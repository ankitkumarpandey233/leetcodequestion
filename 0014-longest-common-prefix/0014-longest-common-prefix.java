class Solution
{
   public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return ""; // Return an empty string if the array is empty
    }
    
    int minLen = Integer.MAX_VALUE;
    for (String str : strs) {
        minLen = Math.min(minLen, str.length()); // Find the minimum length among strings
    }
    
    StringBuilder result = new StringBuilder(); // StringBuilder to build the common prefix
    
    for (int i = 0; i < minLen; i++) {
        char currentChar = strs[0].charAt(i); // Get the character from the first string
        
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != currentChar) {
                return result.toString(); // Return the common prefix found so far
            }
        }
        
        result.append(currentChar); // Append the character to the common prefix
    }
    
    return result.toString(); // Return the final common prefix
}
}
