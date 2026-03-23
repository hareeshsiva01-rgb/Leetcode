class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int m = 0;
        int n = mat[0].length - 1;

        while(n >= 0 && m < mat.length){
            if(mat[m][n] == t){
                return true;
            }
            else if(mat[m][n] > t){
                n--;
            }
            else{
                m++;
            }
        }
        return false;
    }
}