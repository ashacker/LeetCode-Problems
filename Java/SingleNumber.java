/*
	Author:     ashacker
    Date:       May 07, 2018
    Problem:    Single Number
    Difficulty: Easy
    Question:
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Example 1:
    Input: [2,2,1]
    Output: 1

    Example 2:
    Input: [4,1,2,1,2]
    Output: 4

    Solution: XOR each element with the next till the end of the list. The element on the last index is the non repeating number.  
    Time Complexity: O(n)
*/
class Solution {
    public int singleNumber(int[] nums) {        
        if(nums.length == 0) {
            return 0;
        }

        int singleNumber = 0;
        
        for(int i = 0; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }        
        return singleNumber;        
    }
}