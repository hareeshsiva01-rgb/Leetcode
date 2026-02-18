class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder x = new StringBuilder();

        while (n > 0) {
            x.append(n % 2);   
            n = n / 2;
        }

        for (int i = 0; i < x.length() - 1; i++) {
            if (x.charAt(i) == x.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
