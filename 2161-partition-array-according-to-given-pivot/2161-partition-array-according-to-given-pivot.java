class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int[] arr=new int[nums.length];
        int n=nums.length;
        int c=0;
            for(int i=0;i<n;i++){
                if(nums[i]<p){
                    arr[c]=nums[i];
                    c++;
                }
            }
             for(int i=0;i<n;i++){
                if(nums[i]==p){
                    arr[c]=nums[i];
                    c++;
                }
            }
             for(int i=0;i<n;i++){
                if(nums[i]>p){
                    arr[c]=nums[i];
                    c++;
                }
            }
        
        return arr;
    }
}