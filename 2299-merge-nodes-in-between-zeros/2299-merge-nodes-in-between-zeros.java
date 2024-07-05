/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head==null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode dummyNode = new ListNode(-1);
        ListNode cur=dummyNode;
        while(temp != null) {
            int sum=0;
            while(temp.val !=0) {
                sum +=temp.val;
                temp= temp.next;
            }
            ListNode newnode = new ListNode(sum);
            cur.next = newnode;
            cur =newnode;

            temp = temp.next;
        }
        return dummyNode.next;

        
    }
}