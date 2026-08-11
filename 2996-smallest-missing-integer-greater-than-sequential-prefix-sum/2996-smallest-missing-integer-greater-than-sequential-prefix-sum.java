class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        int f=nums[0];
        int st=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1 == nums[i]){
                s+=nums[i];
            }
            else{
                st=i-1;
                break;
                
            }
        }
        while(pre(nums,st,s)){
            s=s+1;
        }
        return s;
    }
    public boolean pre(int[] nums,int s,int n){
        for(int i=s;i<nums.length;i++){
            if(nums[i]==n){
                return true;
            }
        }
        return false;
    }
}