public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        int bit = 31;
        while (n != 0) {
            result |= (n & 1) << bit;
            n >>>= 1;
            bit--;
        }
        return result;
    }
}