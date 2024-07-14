class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        int flag=0;
        long abs=n;
        if(n<0){
            flag=1;
            abs= Math.abs((long)n);
        } 
        while(abs>0) {
            if(abs%2==1){
                ans = ans*x;
                abs=abs-1;
            }else{
                abs=abs/2;
                x=x*x;
            }
        }
        if(flag==1) return 1/ans;
        return ans;
    }
}