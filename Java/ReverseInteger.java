/*
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
*/
class Solution {
    public int reverse(int x) {
        long result = 0;
        while(x != 0) {
            result *= 10;
            result += x%10;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) result;
    }
}