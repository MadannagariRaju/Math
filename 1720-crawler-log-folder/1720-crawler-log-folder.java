class Solution {
    public int minOperations(String[] logs) {
        Stack<String>st =  new Stack<>();

        for(String i: logs) {
            if(!st.isEmpty() && i.equals("../")) {
                st.pop();
            }
            else if(i.equals("./")) {
                continue;
            }else if(!i.equals("../")){
                System.out.println(i);
                st.push(i);
            }

        }
        return st.size();
    }
}