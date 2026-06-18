class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0];
        int cs=0;
        int s=0;
        int e=0;
        int ts=0;
        for(int i=0;i<nums.length;i++){
            if(cs < 0){
                cs=0;
                ts=i;
            }
            cs+=nums[i];
            if(cs > mx){
                mx=cs;
                s=ts;   
                e=i;
            }
        }
        int su=0;
        for(int i=s;i<=e;i++){
            su+=nums[i];
        }
        return su;
    }
}