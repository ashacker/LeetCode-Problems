'''
    Author:     ashacker
    Date:       May 04, 2018
    Problem:    Rotate Array
    Difficulty: Easy
    Question:
    Given an array, rotate the array to the right by k steps, where k is non-negative.

    Example 1:

    Input: [1,2,3,4,5,6,7] and k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: [-1,-100,3,99] and k = 2
    Output: [3,99,-1,-100]
    Explanation: 
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
'''
class Solution:
    '''
    Solution: Use reveral algorithm. First reverse the entire array from 0 to n-1. Then reverse the array from 0 to k-1.
              Finally reverse the array from k to n-1. The array will be rotated.
    Time Complexity: O(n)
    Space Complexity: O(1)
    '''
    def reverseList(self, nums, start, end):
        while(start < end):
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            
            start += 1
            end -= 1
            
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if(n == 0 or n == 1):
            return
        
        if(k > n):
            k -=n
        
        self.reverseList(nums, 0 , n-1)
        self.reverseList(nums, 0 , k-1)
        self.reverseList(nums, k , n-1)

        