class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> charMap = new HashMap<>();
        HashMap<Character, Boolean> charUsed = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (charMap.containsKey(sChar)) {
                if (charMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (charUsed.containsKey(tChar) && charUsed.get(tChar)) {
                    return false;
                }

                charMap.put(sChar, tChar);
                charUsed.put(tChar, true);
            }
        }

        return true;
    
    }
}