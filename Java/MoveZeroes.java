/*
	Author:     ashacker
    Date:       May 14, 2018
    Problem:    Move Zeroes
    Difficulty: Easy
    Question:
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Example:

    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]

    Solution: Initialize an index value at 0. Start a loop and check if a number at index 'i' is not zero. If so, we swap it with the 'index' value.
              This way we continue till the end of the loop till all the elements are rearranged. 
    Time Complexity: O(n)
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0, temp = 0;
        for(int i=0; i < nums.length; i++) {            
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}