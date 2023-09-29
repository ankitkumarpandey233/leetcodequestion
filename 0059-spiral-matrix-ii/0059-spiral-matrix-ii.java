class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
              mat[top][i] = num;
                num++;
            }
            for(int i=top+1;i<=bottom;i++){
              mat[i][right] = num;
                num++;
            }
            for(int i=right-1;i>=left;i--){
              mat[bottom][i] = num;
                num++;
            }
            for(int i=bottom-1;i>=top+1;i--){
              mat[i][left] = num;
                num++;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return mat;
    }
}