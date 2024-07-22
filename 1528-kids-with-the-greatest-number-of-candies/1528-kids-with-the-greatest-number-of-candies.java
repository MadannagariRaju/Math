class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++) {
            int res = candies[i] + extraCandies;
            if(res>=max) {
                al.add(true);
            }else{
                al.add(false);
            }
        }
        return al;
    }
}