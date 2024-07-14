class Solution {
   /* public boolean check(int n) {
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i ==0){
                count++;
                if((n/i !=i)) {
                    count++;
                }
            }
        }
        if(count ==2) return true;
        return false;
    }
    public int countPrimes(int n) {
        int count=0;
        for(int i=1;i<n;i++) {
            if(check(i)){
                // System.out.println(i);
                count++;
            }
        }
        return count;
    }  */
    public int countPrimes(int n) {
        int primes[]= new int[n+1];
        Arrays.fill(primes,1);
       /* for(int i=2;i<=n;i++) {
            if(primes[i] ==1) {
                for(int j=i*2;j<=n;) {
                    primes[j]=0;
                    j+=i;
                }
            }
        } */
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(primes[i] ==1) {
                for(int j=i*i;j<=n;) {
                    primes[j]=0;
                    j+=i;
                }
            }
        }
        // System.out.println(Arrays.toString(primes));
        int count=0;
        // System.out.println(primes.length);
        for(int i=2;i<primes.length-1;i++) {
            // System.out.println(i);
            if(primes[i] ==1) {
                count++;
            }
        }
        return count;

    }
}