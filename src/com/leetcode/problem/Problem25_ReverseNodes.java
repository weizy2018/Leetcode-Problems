package com.leetcode.problem;

class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
//    	if (k == 1) {
//    		return head;
//    	}
        ListNode top = new ListNode(0);
        top.next = head;
        ListNode last = top;
        ListNode lastNext = last.next;
        ListNode current = lastNext;
        ListNode pre = null;
        ListNode currentNext = null;
        while (lastNext != null) {
        	int count = 0;
        	ListNode countNode = lastNext;
        	while (countNode != null && count < k) {
        		count++;
        		countNode = countNode.next;
        	}
        	if (count < k) {
        		last.next = current;
        		break;
        	}
        	for (int i = 0; i < k; i++) {
        		currentNext = current.next;
        		current.next = pre;
        		pre = current;
        		current = currentNext;
        	}
        	last.next = pre;
        	last = lastNext;
        	lastNext = current;
        	pre = null;
        }
    	return top.next;
    }
}

public class Problem25_ReverseNodes {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i = 1; i <= 5; i++) {
			ListNode node = new ListNode(i);
			p.next = node;
			p = node;
		}
		Solution25 s = new Solution25();
		head = s.reverseKGroup(head.next, 1);
		while (head != null) {
			System.out.print("->" + head.val);
			head = head.next;
		}
//		for (int i = 0; i < 5; i++) {
//			System.out.print("->" + head.val);
//			head = head.next;
//		}
		
	}

}
