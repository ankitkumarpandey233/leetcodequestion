class Solution {
    public int arrangeCoins(int n) {
    return (int) (Math.floor((-1 + Math.sqrt(1 + 8L * n)) / 2));
    }
}
