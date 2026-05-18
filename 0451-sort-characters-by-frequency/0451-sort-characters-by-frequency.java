class Solution {

    public String frequencySort(String s) {

        int[] a = new int[128];

        for (char ch : s.toCharArray()) {
            a[ch]++;
        }

        StringBuilder sb = new StringBuilder();

        while (true) {

            int max = 0;
            int maxint = -1;
            for (int i = 0; i < 128; i++) {
                if (a[i] > max) {
                    max = a[i];
                    maxint = i;
                }
            }

            if (max == 0) {
                break;
            }

            while (max > 0) {
                sb.append((char) maxint);
                max--;
            }
            a[maxint] = 0;
        }

        return sb.toString();
    }
}