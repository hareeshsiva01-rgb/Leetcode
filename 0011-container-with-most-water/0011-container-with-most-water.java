class Solution {
    public int maxArea(int[] h) {
      int m=0;
      int j=h.length-1;
      int i=0;
      while(i<j){
        
        int mi=Math.min(h[i],h[j]);
        int x=mi*(j-i);
        m=Math.max(m,x);
        if(h[i]<h[j]){
            i++;
        }
        else{
            j--;
        }
      }
      return m; 
    }
}