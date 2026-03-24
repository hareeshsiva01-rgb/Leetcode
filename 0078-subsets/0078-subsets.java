class Solution {
        List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
       back(0,nums,new ArrayList<>());
       return res;

       
    }
    private void back(int s,int[] nums,List<Integer>p){
        res.add(new ArrayList<>(p));

        for(int i=s;i<nums.length;i++){
            p.add(nums[i]);
            back(i+1,nums,p);
            p.remove(p.size()-1);
        }
    } 

}