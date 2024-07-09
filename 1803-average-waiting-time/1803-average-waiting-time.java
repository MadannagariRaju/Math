class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double AverageTotalTime = 0;
        int currenttime =0;

        for(int i[]: customers) {
            int arrivaltime=i[0];
            int cooktime =i[1];
            if(arrivaltime > currenttime) {
                currenttime=arrivaltime;
            }
            int waittime = currenttime + cooktime - arrivaltime;
            System.out.println(waittime);
            AverageTotalTime +=waittime;
            currenttime +=cooktime;
        }
        return AverageTotalTime/n;
    }
}