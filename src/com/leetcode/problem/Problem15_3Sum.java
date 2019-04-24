package com.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
        	if (i > 0 && nums[i] == nums[i - 1])
        		continue;
        	int left = i+1;
        	int right = nums.length - 1;
        	
        	while (left < right) {
        		int sum = nums[i] + nums[left] + nums[right];
        		if (sum == 0) {
        			List<Integer> resultList = new ArrayList<Integer>();
        			resultList.add(nums[i]);
        			resultList.add(nums[left]);
        			resultList.add(nums[right]);
        			list.add(resultList);
        			
        			left++;
        			right--;
        			while (left < right && nums[left] == nums[left - 1])
        				left++;
        			while (left + 1 < right && nums[right] == nums[right + 1])
        				right--;
        		} else if (sum < 0) {
        			left++;
        		} else {
        			right--;
        		}
        	}
        }
        return list;
    }
}

public class Problem15_3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(new Solution().threeSum(nums));

	}

}
