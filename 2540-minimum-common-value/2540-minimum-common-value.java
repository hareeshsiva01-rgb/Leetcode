class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> s=new TreeSet<>();
        for(int e:nums1){
            s.add(e);
        }
        for(int e:nums2){
            if(s.contains(e)){
                return e;
            }
        }
        return -1;
    }
}