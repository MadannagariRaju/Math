class Solution {
    public int alternateDigitSum(int n) {
        int res=0;
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++) {
            if(i%2 ==0) {
                res += Character.getNumericValue(s.charAt(i));
            }
            else{
                res -=Character.getNumericValue(s.charAt(i));
            }
        }
        return res;
    }
}