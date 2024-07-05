class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum =arrivalTime+delayedTime;
        if(sum ==24) return 0;
        else if(sum<24) return sum;
        else  return sum%24; /* sum>24 eg : sum =25 then 25%24 =>1*/
    }
}