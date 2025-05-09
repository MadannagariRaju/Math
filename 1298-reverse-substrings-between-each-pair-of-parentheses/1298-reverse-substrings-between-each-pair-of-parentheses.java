class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st = new Stack<>();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==')') {
                Queue<Character>q = new LinkedList<>();
                while(!st.isEmpty() && st.peek() !='(') {
                    q.add(st.pop());
                }
                st.pop();
                while(!q.isEmpty()) {
                    st.push(q.remove());
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}