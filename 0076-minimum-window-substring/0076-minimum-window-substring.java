class Solution {
    public String minWindow(String s, String t) {
          if (s.length() < t.length()) {
            return "";
        }

        int[] f=new int[128];
        for(int i:t.toCharArray()){
            f[i]++;
        }
        int st=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        int n=t.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(f[ch]>0){
                n--;
            }
            f[ch]--;
            while(n == 0){
                if(i-l+1 < min){
                    min=i-l+1;
                    st=l;
                }
                char lc=s.charAt(l);
                f[lc]++;
                if(f[lc]>0){
                    n++;
                }
                l++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(st,st+min);
    }
}