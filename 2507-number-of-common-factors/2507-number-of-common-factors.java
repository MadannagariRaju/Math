class Solution {
    public int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        
        int count=0;
        for(int i=min;i>0;i--) {
            if(a%i==0 && b%i==0) {
                count++;
            }
        }
        return count;
    }
}