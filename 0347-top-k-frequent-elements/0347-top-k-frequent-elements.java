class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
       l.sort((a,b)->b.getValue()-a.getValue());
       int[] arr=new int[k];
        for(int i=0;i<k && i<l.size();i++){
            Map.Entry<Integer,Integer> e=l.get(i);
            arr[i]=e.getKey();
        }
        return arr;
    }
}