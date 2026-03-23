class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int c = Integer.MAX_VALUE;
        int i=0;
        int s=0;
        for(int j = 0;j<nums.length;j++){
            s+=nums[j];
            while(s>=t){
                c=Math.min(c,j-i+1);
                s-=nums[i];
                i++;
            }
           
        }
        
        return c==Integer.MAX_VALUE?0:c;
    }
}