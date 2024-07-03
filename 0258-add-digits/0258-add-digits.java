class Solution {
    public int addDigits(int num) {
        while(true){
            int sum=0,r=0;
            while(num !=0) {
                r = num%10;
                sum +=r;
                num =num/10;
            }
            if(sum <10) return sum;
            num = sum;
        }
    }
}