class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int m=mat.length;
        int n=mat[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int mi=l+(r-l)/2;
            int ro=mi/n;
            int co=mi%n;
            int v=mat[ro][co];
            if(v== t){
                return true;
            }
            else if(v < t){
                l=mi+1;
            }
            else{
                r=mi-1;
            }
        }
        return false;
    }
}