package com.leetcode.problem;

class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    	ListNode left = head;
    	ListNode right = head;
    	for (int i = 0; i < n; i++) {
    		right = right.next;
    	}
    	if (right != null) {
    		while (right.next != null) {
        		left = left.next;
        		right = right.next;
        	}
    		ListNode temp = left.next;
    		left.next = temp.next;
    	} else {
    		head = head.next;
    	}
    	
    	return head;
    }
}

public class Problem19_RemoveNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode p = head;
		for (int i = 2; i <= 10; i++) {
			ListNode node = new ListNode(i);
			node.next = null;
			p.next = node;
			p = node;
		}
		p = head;
		while (p != null) {
			System.out.print("->" + p.val);
			p = p.next;
		}
		System.out.println();
		
		Solution19 s = new Solution19();
		head = s.removeNthFromEnd(head, 3);
		p = head;
		while (p != null) {
			System.out.print("->" + p.val);
			p = p.next;
		}

	}

}
