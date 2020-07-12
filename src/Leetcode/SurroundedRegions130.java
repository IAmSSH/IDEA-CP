package Leetcode;

public class SurroundedRegions130 {
    public static void main(String[] args) {
        class Solution {
            public void solve(char[][] board) {
                if ( board.length >= 2 ) {
                    for (int i = 0; i < board[0].length; i++) {
                        topBorderAndNeighbourCheck(board, 0, i);
                        bottomBorderAndNeighbourCheck(board, board.length-1, i);
                    }

                    for (int i = 0; i < board.length; i++) {
                        leftBorderCheck(board, i, 0);
                        rightBorderCheck(board, i, board[0].length-1);
                    }

                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board[0].length; j++) {
                            if ( board[i][j] == 'O' ) {
                                board[i][j] = 'X';
                            }
                        }
                    }

                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board[0].length; j++) {
                            if ( board[i][j] == '*' ) {
                                board[i][j] = 'O';
                            }
                        }
                    }

//                    for (char[] q : board){
//                        for (char x : q) {
//                            System.out.print(x + " ");
//                        }
//                        System.out.println();
//                    }
                }
//                for (char[] q : board){
//                    for (char x : q) {
//                        System.out.print(x + " ");
//                    }
//                    System.out.println();
//                }
            }

            private void rightBorderCheck(char[][] board, int i, int j) {
                if ( board[i][j] == 'O' ) {
                    board[i][j] = '*';
                    if ( board[i][j-1] == 'O' ) {
                        board[i][j-1] = '*';
                    }
                }
            }

            private void leftBorderCheck(char[][] board, int i, int j) {
                if ( board[i][j] == 'O' ) {
                    board[i][j] = '*';
                    if ( board[i][j+1] == 'O' ) {
                        board[i][j+1] = '*';
                    }
                }
            }

            private void topBorderAndNeighbourCheck(char[][] board, int i, int j) {
                if ( board[i][j] == 'O' ) {
                    board[i][j] = '*';
                    if ( board[i+1][j] == 'O' ) {
                        board[i+1][j] = '*';
                    }
                }
            }

            private void bottomBorderAndNeighbourCheck(char[][] board, int i, int j) {
                if ( board[i][j] == 'O' ) {
                    board[i][j] = '*';
                    if ( board[i-1][j] == 'O' ) {
                        board[i-1][j] = '*';
                    }
                }
            }
        }

        Solution s = new Solution();
        char [][] board = {
                {'X','X','O','X'}
        };

        for (char[] q : board){
            for (char x : q) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

         s.solve(board);
//        System.out.println(board[0].length);
    }
}
