class Solution {
    public int numIslands(char[][] g) {
        int n=g.length;
        int m=g[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]=='1'){
                    c++;
                    dfs(g,i,j,m,n);
                }
            }
        }
        return c;
    }
    public static void dfs(char[][] g, int i, int j, int m,int n){
        if(i<0  || j<0 || i>=n || j>=m || g[i][j]=='0'){
            return;
        }
        g[i][j]='0';
        dfs(g,i+1,j,m,n);
        dfs(g,i-1,j,m,n);
        dfs(g,i,j+1,m,n);
        dfs(g,i,j-1,m,n);
    }
}