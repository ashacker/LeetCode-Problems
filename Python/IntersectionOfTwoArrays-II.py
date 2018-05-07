'''
    Author:     ashacker
    Date:       May 07, 2018
    Problem:    Intersection of Two Arrays II
    Difficulty: Easy
    Question:
    Given two arrays, write a function to compute their intersection.

    Example:
    Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

    Note:
    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.

    Solution: Sort the two arrays. Create a result array with the dimensions of the smaller array. Start looping through
              until the end of both arrays. If the two elements at the corresponding index are equal increment the indices
              of both arrays and add the element in the result array. Else, check which element is greater, then increment
              the index of the array which has the smaller index when compared. Continue this till the end. The result array
              will contain the intersection of elements. 
    Time Complexity: O(m * logm) + O(n * logn), where m and n are the sizes of the two arrays.
'''
class Solution:
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        nums1.sort()
        nums2.sort()
        
        result = list()
        i = 0
        j = 0
        
        while(i < len(nums1) and j < len(nums2)):
            if(nums1[i] == nums2[j]):
                result.append(nums1[i])
                i += 1
                j += 1
            elif(nums1[i] > nums2[j]):
                j += 1
            elif(nums1[i] < nums2[j]):
                i += 1        
        return result