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
    public int findGcd(int a,int b) {
        while(a!=0 && b!=0) {
            if(a>b) a=a%b;
            else  b=b%a;
        }
        return (a!=0)?a:b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp= head;
        while(temp.next != null) {
            int data = findGcd(temp.val,temp.next.val);
            ListNode newnode = new ListNode(data);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode.next;
        }
        return head;
    }
}