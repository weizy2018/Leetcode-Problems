package com.leetcode.problem;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
        	if (nums[j] != val) {
        		nums[i] = nums[j];
        		i++;
        	}
        }
        return i;
    }
}

public class Problem27_RemoveElement {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int len = new Solution27().removeElement(nums, 2);
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
	}

}
