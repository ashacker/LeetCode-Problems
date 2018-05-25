'''
    Author:     ashacker
    Date:       May 25, 2018
    Problem:    Reverse Integer
    Difficulty: Easy
    Question:
    Given a 32-bit signed integer, reverse digits of an integer.

    Example 1:
    Input: 123
    Output: 321

    Example 2:
    Input: -123
    Output: -321

    Example 3:
    Input: 120
    Output: 21

    Note:
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

    Solution: Declare and initialize a variable as long primitive data type to hold the reversed number. In a loop, find the remainder of the number when divided by 10. Multiple the result by 10 each time to shift the reversed number left by one place. After each iteration, divide the number by 10. Continue this till the number is 0. At any point of time during the iteration, if the resulting value overflows the maximum or minimum integer range, return 0.
    Time Complexity: O(log(n))
'''
class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        result = 0
        n = x
        if x < 0:
            n *= -1
        while(n != 0):
            result = result * 10
            result = result + n%10
            if result > (2 ** 31)-1 or result < -2 ** 31:
                return 0
            n = n//10
        if x < 0:
            result *= -1
        return result
        