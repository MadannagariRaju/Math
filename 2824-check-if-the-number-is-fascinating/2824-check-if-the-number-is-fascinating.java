class Solution {
    public boolean isFascinating(int n) {
        int one=n;
        int two = n*2;
        int three = n*3;
        StringBuilder sb = new StringBuilder();
        sb.append(one);
        sb.append(two);
        sb.append(three);
        System.out.println(sb.toString());
        String s= sb.toString();
        int hash[]= new int[11];
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)-'0' == 0) return false;
            hash[s.charAt(i)-'0']++;
        }
        for(int i=1;i<hash.length;i++) {
            if(hash[i]>1) return false;
        }

        return true;
        
    }
}