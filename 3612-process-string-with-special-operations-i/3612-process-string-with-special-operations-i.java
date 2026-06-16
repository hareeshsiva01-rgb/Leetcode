class Solution {
    public String processStr(String s) {
    StringBuilder sb = new StringBuilder("");
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'){
            if(c!= 0){
                sb.deleteCharAt(c-1);
                c--;
            }
        }
        else if(s.charAt(i)=='#'){
            sb.append(sb);
            c=c*2;
        }
        else if(s.charAt(i)=='%'){
            sb.reverse();
        }
        else{
            sb.append(s.charAt(i));
            c++;
        }
    }
    return sb.toString(); 
    }
}
