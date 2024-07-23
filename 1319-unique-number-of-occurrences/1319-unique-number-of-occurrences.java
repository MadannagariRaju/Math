class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        Set<Integer>s = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()) {
            if(s.contains(e.getValue())) {
                return false;
            }
            s.add(e.getValue());
        }
        return true;
    }
}