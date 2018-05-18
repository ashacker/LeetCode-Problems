/*
    Author:     ashacker
    Date:       May 18, 2018
    Problem:    Valid Sudoku
    Difficulty: Easy
    Question:
    Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

    A partially filled sudoku which is valid.

    The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

    Solution: Check each row, column and sub grids for validity by using a set for checking if a number has already been seen. If so, return false, else return true. 
    Time Complexity: O(n^2)
*/


import java.util.*;

class Solution {
    public boolean checkRow(char[][] board) {
        for(int i=0; i < 9; i++) {
            Set<Integer> boardCheck = new HashSet<Integer>();
            for(int j=0; j < 9; j++) {
                if(board[i][j] !='.') {                    
                    if(boardCheck.contains((int)board[i][j])) {
                        return false;
                    }
                    else {
                        boardCheck.add((int)board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkColumn(char[][] board) {
        for(int j=0; j < 9; j++) {
            Set<Integer> boardCheck = new HashSet<Integer>();
            for(int i=0; i < 9; i++) {
                if(board[i][j] !='.') {                    
                    if(boardCheck.contains((int)board[i][j])) {
                        return false;
                    }
                    else {
                        boardCheck.add((int)board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkSubGrid(char[][] board) {
        for(int k = 0; k < 9; k++) {
            Set<Integer> boardCheck = new HashSet<Integer>();
           for(int i = k/3*3; i < k/3*3+3; i++) {
                for(int j = k%3*3; j < k%3*3+3; j++) {
                    if(board[i][j] !='.') {                    
                        if(boardCheck.contains((int)board[i][j])) {
                            return false;
                        }
                        else {
                            boardCheck.add((int)board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        
        if(this.checkRow(board) && this.checkColumn(board) && this.checkSubGrid(board)) {
            return true;
        }        
        return false;        
    }
}