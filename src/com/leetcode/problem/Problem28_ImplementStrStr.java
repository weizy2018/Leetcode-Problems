package com.leetcode.problem;

class Solution28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class Problem28_ImplementStrStr {

	public static void main(String[] args) {
		String haystack = "aaaaa";
		String needle = "";
		System.out.println(new Solution28().strStr(haystack, needle));

	}

}
