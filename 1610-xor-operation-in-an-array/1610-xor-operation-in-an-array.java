class Solution {
    public int xorOperation(int n, int start) {
        int res[]= new int[n];
        res[0]=start;
        for(int i=1;i<n;i++) {
            res[i]=start + 2*i;
        }
        int ans=0;
        for(int i=0;i<res.length;i++) {
            ans=ans^res[i];
        }
        return ans;
    }
}