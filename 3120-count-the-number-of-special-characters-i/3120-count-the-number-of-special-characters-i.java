class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>u =new HashSet<>();
        Set<Character>l =new HashSet<>();
        int z=0;
        for(char i:word.toCharArray()){
            if(Character.isUpperCase(i)){
                u.add(i);
            }
            else{
                l.add(i);
            }
        }
        for (char y:l) {
        char x = (char)(y- 32);
        if(u.contains(x)){
            z++;
        }
        }
        return z;
    }
}