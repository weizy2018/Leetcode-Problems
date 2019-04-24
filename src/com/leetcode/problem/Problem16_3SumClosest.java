package com.leetcode.problem;

import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	
    	for (int x: nums) {
    		System.out.print(x + " ");
    	}
    	System.out.println("");
    	
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
        	if (i > 0 && nums[i] == nums[i - 1])
        		continue;
        	int left = i + 1;
        	int right = nums.length - 1;
        	while (left < right) {
        		int sum = nums[i] + nums[left] + nums[right];
        		if (sum == target) {
        			return sum;
        		}
        		if (Math.abs(target - sum) < Math.abs(target - result)) {
        			result = sum;
        		}
        		if (sum > target) {
        			right--;
        			while (right > left && nums[right] == nums[right + 1]) {
        				right--;
        			}
        		} else {
        			left++;
        			while (left > right && nums[left] == nums[left - 1]) {
        				left++;
        			}
        		}
        	}
        }
        
        
        return result;
    }
}

public class Problem16_3SumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,-1,-1,3};
		System.out.println(new Solution16().threeSumClosest(nums, -1));

	}

}
