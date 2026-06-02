class Solution {
    public int earliestFinishTime(
        int[] landStartTime, int[] landDuration, 
        int[] waterStartTime, int[] waterDuration
    ) {
        int landMinTime = findMinTime(
            landStartTime, 
            landDuration, 
            waterStartTime, 
            waterDuration
        );
        int waterMinTime = findMinTime(
            waterStartTime, 
            waterDuration, 
            landStartTime, 
            landDuration
        );
        return landMinTime <= waterMinTime 
            ? landMinTime 
            : waterMinTime;
    }
    
    private int findMinTime(
        int[] startTime_1, int[] duration_1, 
        int[] startTime_2, int[] duration_2
    ) {
        int minEndTime_1 = 0;
        for (int i = 0; i < startTime_1.length; i++) {
            int endTime = startTime_1[i] + duration_1[i];
            minEndTime_1 = minEndTime_1 != 0 && minEndTime_1 < endTime 
                ? minEndTime_1 
                : endTime;
        }

        int minEndTime_2 = 0;
        for (int i = 0; i < startTime_2.length; i++) {
            int endTime = minEndTime_1 + duration_2[i];
            if (startTime_2[i] > minEndTime_1) endTime += startTime_2[i] - minEndTime_1;
            minEndTime_2 = minEndTime_2 != 0 && minEndTime_2 < endTime 
                ? minEndTime_2 
                : endTime;
        }

        return minEndTime_2;
    }
}