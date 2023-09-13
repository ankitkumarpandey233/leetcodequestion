class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
        	char fc = s.charAt(start);
        	char lc = s.charAt(end);
        	if (!Character.isLetterOrDigit(fc )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(lc)) {
        		end--;
        	} else {
        		if (Character.toLowerCase(fc) != Character.toLowerCase(lc)) {
        			return false;
        		}
        		start++;
        		end--;
        	}
        }
        return true;
    }
}