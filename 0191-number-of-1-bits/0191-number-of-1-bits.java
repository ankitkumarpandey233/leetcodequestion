public class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int mask=1;
        while(n!=0){
            if((n&mask)==1){
                count++;
            }
          n= n>>>1;
        }
        return count;
    }
}