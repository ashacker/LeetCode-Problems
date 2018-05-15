'''
    Author:     ashacker
    Date:       May 15, 2018
    Problem:    Two Sum
    Difficulty: Easy
    Question:
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1]

    Solution: Create a dictionary. Store the difference of the target and current element as key and its index 
              as value while looping through the array, only if the dictionary does no contain the current element
              as a key. Else, store the current element's index value and the current iteration index in the result
              array and return it. The idea is that the difference of the target one of the integers is equal to
              the other integer that sum up to the target value.
    Time Complexity: O(n)
'''
class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        diff = dict()        
        for i in range(len(nums)):
            if nums[i] in diff.keys():
                return [diff[nums[i]], i]
            else:
                diff[target-nums[i]] = i     