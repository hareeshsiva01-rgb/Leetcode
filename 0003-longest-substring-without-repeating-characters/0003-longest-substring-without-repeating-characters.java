class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int c=0;
        for(int i=0;i<s.length();i++){
            List<Character> l=new ArrayList<>();
            int t=0;
            for(int j=i;j<s.length();j++){
                if(l.contains(s.charAt(j))){
                    break;
                }
                else{
                    l.add(s.charAt(j));
                    t++;
                }
            }
            if(t>c){
                c=t;
            }
        }
        return c;
    }
}