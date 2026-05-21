class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            while(i>0){
                set.add(i);
                i=i/10;
            }
        }
        int m=0;
        for(int i : arr2){
            int t=i;
            while(t>0){
                if(set.contains(t)){
                    int l=String.valueOf(t).length();
                    m=Math.max(m,l);
                    break;
                }
            t=t/10;
            }
        }
        return m;
    }
}