class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        int top =0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
    while(top<=bottom && left<=right){
        //for top
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }

        //for right
        for(int i=top+1;i<=bottom;i++){
            list.add(matrix[i][right]);
        }

       //for bottom
        for(int i=right-1;i>=left;i--){
            if(top==bottom){
                break;
            }
            list.add(matrix[bottom][i]);
        }

        //for left
        for(int i=bottom-1;i>=top+1;i--){
            if(left==right){
                break;
            }
            list.add(matrix[i][left]);
        }
          top++;
          left++;
          bottom--;
          right--;
    }
        return list;
    }
}