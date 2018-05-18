/*

    Author:     ashacker
    Date:       May 18, 2018
    Problem:    Reverse String
    Difficulty: Easy
    Question:
    Write a function that takes a string as input and returns the string reversed.
    Example:
    Given s = "hello", return "olleh".
*/

class Solution {
    /*    
    Solution 1: Use substrings and divide the string into three parts, concatenate them and reverse them for the entire length of the string.   
    Time Complexity: O(n^2)
    */
    public String reverseStringOne(String s) {
        for(int i=0; i< s.length();i++) {
            s = s.substring(0,i) + s.substring(s.length()-1,s.length()) + s.substring(i,s.length()-1);
        }
        return s;
    }

    /*    
    Solution 2: Convert the string into a char array. Then run a loop while swapping the first and last characters in the string.   
    Time Complexity: O(n)
    */
    public String reverseStringTwo(String s) {
        char[] charInput = s.toCharArray();
        int first = 0;
        int last = s.length() - 1;
        char temp;
        while(first < last) {
            temp = charInput[last];
            charInput[last] = charInput[first];
            charInput[first] = temp;
            first++;
            last --;
        }
        return new String(charInput);
    }
}