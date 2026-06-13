class Solution {
    public String mapWordWeights(String[] w, int[] we) {
        String r="";
        for(String s:w){
            int su=0;
            for(char x:s.toCharArray()){
                su+=we[x-'a'];
            }
            int x=su%26;
            r+= (char) ('z' - x);
        }
        return r;
    }
}