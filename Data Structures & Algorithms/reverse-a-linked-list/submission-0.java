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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        head.val=s.pop();
        ListNode curr=head;
        while(!s.isEmpty())
        {
             curr=curr.next;
             curr.val=s.pop();

        }
        return head;
    }
}
