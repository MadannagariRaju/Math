class Solution {
    public int numberOfMatches(int n) {
        int sum =0;
        int team =n;
        while(team !=1) {  
            int matches=team/2;
            sum += matches;
            team= team - matches;
            System.out.println(team);
        }
        return sum;

    }
}