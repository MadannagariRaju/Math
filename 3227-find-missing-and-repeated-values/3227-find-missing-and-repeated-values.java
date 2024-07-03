class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int hash[]= new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                hash[grid[i][j]]++;
            }
        }
        int res[]= new int[2];
   
        int mis=0, rep =0;
        for(int i=1;i<hash.length;i++) {
            if(hash[i]==2) {
                rep=i;
            }
            else if(hash[i]==0){
                mis=i;
            } 
        }
        // System.out.println(hash.length);
        res[0]=rep;
        res[1]=mis;
        return res;
    }
}