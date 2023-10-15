class Solution {
    public int[] findIndices(int[] A, int d, int v) {
        int minimum = 0;
        int  maximum = 0;
        int n = A.length;
        for (int i = d; i < n; i++) {
            if (A[i - d] < A[minimum]) 
            {
                minimum = i - d;
            }
            if (A[i - d] > A[maximum])
            {
                 maximum = i - d;
            }
            if (A[i] - A[minimum] >= v)
            {
                return new int[] {minimum, i};
            } 
            if (A[maximum] - A[i] >= v) {
                return new int[] {maximum, i};
                }
        }
        return new int[] { -1, -1};
    }
}