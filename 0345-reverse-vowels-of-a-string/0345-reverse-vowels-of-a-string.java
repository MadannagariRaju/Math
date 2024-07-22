class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        ArrayList<Character>al = new ArrayList<>();
        char ch[]={'a','e','i','o','u','A','E','I','O','U'};
        char sch[] = s.toCharArray();
        for(int m=0;m<ch.length;m++) {
            al.add(ch[m]);
        }
        while(i<j) {
            if(!al.contains(sch[i])) {
                i++;
            }
            if(!al.contains(sch[j])) {
                j--;
            }
            if(al.contains(sch[i]) && al.contains(sch[j])) {
                char temp = sch[i];
                sch[i]=sch[j];
                sch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(sch);
    }
}