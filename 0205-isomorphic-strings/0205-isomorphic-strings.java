class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map1.containsKey(sChar)) {
                if (map1.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (map2.containsKey(tChar) && map2.get(tChar)) {
                    return false;
                }

                map1.put(sChar, tChar);
                map2.put(tChar, true);
            }
        }

        return true;
    
    }
}