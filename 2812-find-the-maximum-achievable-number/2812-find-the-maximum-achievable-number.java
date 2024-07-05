class Solution {
    public int theMaximumAchievableX(int num, int t) {

        /*
            eg: num = 3, t=2;
            3+1+1 = 5;
            X - 1-1 = 5;
            X=5+1+1;

            num_+1_+1-1_-1_X
               ---t--|--t--
               distance is 2t
               X-num = 2t;
               X = 2t+num;
        */
        // for(int i=0;i<t;i++) num ++;
        // for(int i=0;i<t;i++) num++;
        // return num;

        return num + 2*t;
    }
}