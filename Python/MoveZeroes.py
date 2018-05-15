'''
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
'''
class Solution:
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        index = 0
        for i in range(len(nums)):
            if nums[i]:
                temp = nums[index]
                nums[i] = nums[index]
                nums[index] = temp
                index += 1