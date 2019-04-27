package com.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	if (nums.length < 4) {
    		return result;
    	}
    	
    	Arrays.sort(nums);
    	
    	System.out.println(Arrays.toString(nums));
    	
    	for (int i = 0; i < nums.length - 3; i++) {
    		if (i != 0 && nums[i] == nums[i - 1]) {
    			continue;
    		}
    		for (int second = i + 1; second < nums.length - 2; second++) {
    			if (second != i + 1 && nums[second] == nums[second - 1]) {
    				continue;
    			}
    			int third = second + 1;
        		int fourth = nums.length - 1;
        		int sum = nums[i] + nums[second] + nums[third] + nums[fourth];
        		while (third < fourth) {
        			if (sum == target) {
        				List<Integer> tuple = new ArrayList<Integer>();
        				tuple.add(nums[i]);
        				tuple.add(nums[second]);
        				tuple.add(nums[third]);
        				tuple.add(nums[fourth]);
        				result.add(tuple);
        				third++;
        				while (third < fourth - 1 && nums[third] == nums[third - 1]) {
        					third++;
        				}
        				fourth--;
        				while (fourth > third && nums[fourth] == nums[fourth + 1]) {
        					fourth--;
        				}
        			} else if (sum < target) {
        				third++;
        			} else {
        				fourth--;
        			}
        			sum = nums[i] + nums[second] + nums[third] + nums[fourth];
        		}
    		}
    	}
    	return result;
    }
}

public class Problem18_4Sum {

	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		Solution18 s = new Solution18();
		List<List<Integer>> list = s.fourSum(nums, 0);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> ls = list.get(i);
			System.out.println(ls.toString());
		}
		

	}

}
