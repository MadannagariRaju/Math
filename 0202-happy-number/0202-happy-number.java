class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();
        while(true) {
            int sum =0,r=0;
            while(n!=0) {
                r = n%10;
                sum += Math.pow(r,2);
                n =n/10;
            }
            if(sum ==1) return true;
            n=sum;
            if(set.contains(sum)) return false;
            else {
                set.add(sum);
            }
        }
        
    }
}