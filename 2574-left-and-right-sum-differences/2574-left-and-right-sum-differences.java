class Solution {
    public int[] leftRightDifference(int[] n) {
        int nl=n.length;
        int[] l=new int[nl];
        int[] r=new int[nl];
        int[] f=new int[nl];
        if(nl < 1){
            return f;
        }
        for(int i=0;i<nl;i++){
            if(i==0){
                l[i]=0;
                continue;
            }
            l[i]=n[i-1]+l[i-1];
        }
        for(int i=nl-1;i>=0;i--){
            if(i==nl-1){
                r[i]=0;
                continue;
            }
            r[i]=n[i+1]+r[i+1];
        }
        for(int i=0;i<nl;i++){
            f[i]=Math.abs(l[i]-r[i]);
        }
        return f;
    }   
}