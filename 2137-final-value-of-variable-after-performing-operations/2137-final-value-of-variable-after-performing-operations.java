class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x = 0;
        for(String o : op) x += (44 - o.charAt(1));
        return x;
    }
}