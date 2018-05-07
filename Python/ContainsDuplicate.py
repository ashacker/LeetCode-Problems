'''
    Author:     ashacker
    Date:       May 05, 2018
    Problem:    Contains Duplicate
    Difficulty: Easy
    Question:
    Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true
    Example 2:

    Input: [1,2,3,4]
    Output: false
    Example 3:

    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true

    Solution: Sort the array, then, iterate through the sorted array compare the current element with the next. If they are equal then return true.
              Else, return false.
    Time Complexity: O(nlogn)
'''
class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        if(len(nums) < 1):
            return False
        
        nums.sort()
        
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1] :
                return True
        
        return False