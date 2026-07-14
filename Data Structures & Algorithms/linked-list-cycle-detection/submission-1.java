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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        HashSet<ListNode> set=new HashSet<>();
        int index=-1;
        if(head==null)
        {
            return false;
        }
        while(temp.next!=null)
        {
            
            if(temp.next!=null && set.contains(temp))
            {
                return true;
            }
            set.add(temp);
            temp=temp.next;
        }
       return false;
    }
}
