package com.leetcode.problem;

class Solution24 {
    public ListNode swapPairs(ListNode head) {
    	if (head == null) {
    		return head;
    	}
        ListNode top = new ListNode(0);
        top.next = head;
        ListNode p1 = top;
        ListNode p2 = top.next;
        ListNode p3 = p2.next;

        while (p3 != null) {
        	p1.next = p3;
        	p2.next = p3.next;
        	p3.next = p2;
        	p1 = p2;
        	p2 = p1.next;
        	if (p2 == null) {
        		p3 = null;
        	} else {
        		p3 = p2.next;
        	}
        }
        return top.next;
    }
}

public class Problem24_SwapNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
