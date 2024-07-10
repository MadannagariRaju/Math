class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int temp = num;

        for(int i=1;i<Math.sqrt(num);i++) {
            if(num%i ==0) {
                System.out.println(i);
                sum +=i;
                if(num/i !=i && num/i !=num){
                System.out.println(num/i);
                    sum +=num/i;
                }
            }
        }
        if(sum == temp) return true;
        return false;
    }
}