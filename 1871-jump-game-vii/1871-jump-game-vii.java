class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();
        boolean[] reach = new boolean[n];
        reach[0] = true;
        int reachableCount = 0;
        for (int i = 1; i < n; i++) {
            if (i - minJump >= 0 && reach[i - minJump]) {
                reachableCount++;
            }
            if (i - maxJump - 1 >= 0 &&
                reach[i - maxJump - 1]) {
                reachableCount--;
            }
            if (reachableCount > 0 &&
                s.charAt(i) == '0') {

                reach[i] = true;
            }
        }
        return reach[n - 1];
    }
}