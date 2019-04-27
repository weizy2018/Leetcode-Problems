package com.leetcode.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
    	List<Integer> list = new ArrayList<Integer>();
    	for (ListNode node: lists) {
    		while (node != null) {
    			list.add(node.val);
    			node = node.next;
    		}
    	}
    	Collections.sort(list);
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int a: list) {
        	ListNode node = new ListNode(a);
        	//ListNode中的next初始胡默认为null，所以这里不必重新赋值
        	p.next = node;
        	p = node;
        }
        return head.next;
    }
}

public class Problem23_MergeLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
