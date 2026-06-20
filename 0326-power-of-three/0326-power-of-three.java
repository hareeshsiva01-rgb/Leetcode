class Solution {
    public boolean isPowerOfThree(int n) {
        boolean f=false;
        if(n<=0){
            return false;
        }
        while(n % 3==0){
            n/=3;
        }
        f=n==1?true:false;
        return f;
    }
}