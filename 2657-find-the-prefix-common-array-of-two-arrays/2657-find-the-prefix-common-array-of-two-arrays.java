class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c=new int[A.length];
        for(int i=0;i<A.length;i++){
            int res=com(i,A,B);
            c[i]=res;
        }
        return c;
    }
    int com(int i,int[] A,int[] B){
        int c=0;
       List<Integer>y=new ArrayList<>();
        for(int a=0;a<=i;a++){
            y.add(B[a]);
        }
        for(int a=0;a<=i;a++){
            if(y.contains(A[a])){
                c++;
            }
        }
        return c;
    }
}