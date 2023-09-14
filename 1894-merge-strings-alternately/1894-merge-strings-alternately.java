class Solution {
    public String mergeAlternately(String w1, String w2) {
        String out = "";
        int i = 0;
        while (i < w1.length() || i < w2.length()) {          
            if ( i < w1.length() ) {
                out += w1.charAt(i);
            }
            if (i < w2.length()) {
                out += w2.charAt(i);
            }
            i++;
        }
        return out;
    }
}