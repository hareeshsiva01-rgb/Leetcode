class Solution {
    public int numOfStrings(String[] p, String w) {
        int c=0;
        int n=p.length;
            for(String ch:p){
                if(w.contains(ch)){
                    c++;
                }
            }
        
        return c;
    }
}