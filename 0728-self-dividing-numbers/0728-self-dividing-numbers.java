class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer>al = new ArrayList<>();

        for(int i=left;i<=right;i++) {
            if(i<10) {
                al.add(i);
            }else{
                if(check(i)){
                    int n = i;
                    al.add(n);
                }
            }
        }
        return al;
    }
    public boolean check(int n) {
        int temp =n;
        while(n!=0) {
            int r=n%10;
            if(r==0) return false;
            if(temp%r !=0) return false;
            n=n/10;
        }
        return true;
    }
}