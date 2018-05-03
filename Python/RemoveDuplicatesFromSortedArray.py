'''
    Author:     ashacker
    Date:       May 03, 2018
    Problem:    Remove Duplicates from Sorted Array
    Difficulty: Easy
    Question:
    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Example 1:

    Given nums = [1,1,2],

    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

    It doesn't matter what you leave beyond the returned length.
    Example 2:

    Given nums = [0,0,1,1,1,2,2,3,3,4],

    Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

    It doesn't matter what values are set beyond the returned length.

     Solution: Have an index of the last seen unqiue element. Iterate through the next element and check if it is equal to the element at the last seen index, if not update the last seen unique element and increment the index.
     Time Complexity: O(n)
'''
class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(len(nums) == 0):
            return
        
        prevIndex = 0
        for i in range(1,len(nums)):
            if nums[i] == nums[prevIndex]:
                continue
            else:
                prevIndex += 1
                nums[prevIndex] = nums[i]                
        return prevIndex+1
        