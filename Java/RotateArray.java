/*
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
*/
class Solution {
/*
    Method 1:
    Solution: Iterate through the k steps. In each iteration, take the last element into a temp variable and
              shift all the elements by one index down the array. In the end, replace the first index by the
              temp variable
    Time Complexity: O(k*n)
    Space Complexity: O(1)
*/
    public void rotateMethodOne(int[] nums, int k) {
        while(k > 0) {            
            int temp = nums[nums.length-1];
            for(int i = (nums.length-2); i >= 0 ; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }
    }

/*
    Method 2:
    Solution: Create a temporary array. Copy the last k elements into it. Shift all elements in nums array by k.
              Then copy back the elements from temp array into nums array.
    Time Complexity: O(n)
    Space Complexity: O(k)
*/

    public void rotateMethodTwo(int[] nums, int k) {
        
        if(nums.length == 0 || nums.length == 1) {
            return;
        }
        
        // If offset is greater than length of array, then make it negative.
        if(k > nums.length) {
            k -= nums.length;
        }
        
        // Temporary Array
        int[] temp = new int[k];
        
        // Copy the last k elements into temp array
        for(int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }
        
        // Shift the elements in nums array by k
        for(int j = nums.length-1; j >= k ; j--) {
            nums[j] = nums[j-k];
        }

        // Copy the elements from temp array into nums array.
        for(int x = 0; x < k; x++) {
            nums[x] = temp[x];
        }
    }

/*
    Method 3:
    Solution: Use reveral algorithm. First reverse the entire array from 0 to n-1. Then reverse the array from 0 to k-1.
              Finally reverse the array from k to n-1. The array will be rotated.
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

   public void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public void rotateMethodThree(int[] nums, int k) {
        
        int n = nums.length;
        if(n == 0 || n == 1) {
            return;
        }
        
        if(k > n) {
            k -= n;
        }
        
        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);

    }
}
