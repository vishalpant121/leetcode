package leetcode;

import java.util.HashMap;

public class ValidSudoku {


    public static void main(String[] args) {


        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        for(int i= 0; i< 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(isValidSudoku(board));
    }


    public static boolean isValidSudoku(char[][] board) {

        HashMap<Character, Integer> map = new HashMap<>();

        //each row
        for(int i=0; i<9 ; i++) {

            for(char k = '1'; k<='9'; k++) {
                map.put(k, 0);
            }

            for(int j=0; j<9; j++) {
                if (board[i][j] != '.') {
                    int currentCount = map.get(board[i][j]);
                    map.put(board[i][j], currentCount + 1);
                    if (currentCount > 0) {
                        return false;
                    }
                }
            }
        }

        //each column
        map.clear();

        for(int i=0; i<9 ; i++) {

            for(char k = '1'; k<='9'; k++) {
                map.put(k, 0);
            }

            for(int j=0; j<9; j++) {
                if(board[j][i] != '.') {
                    int currentCount = map.get(board[j][i]);
                    map.put(board[j][i], currentCount + 1);
                    if (currentCount > 0) {
                        return false;
                    }
                }
            }
        }

        // 3*3 subboxes
        return isSubBoxValid(board, 0, 0) && isSubBoxValid(board, 3, 0) && isSubBoxValid(board, 6, 0)
                && isSubBoxValid(board, 0, 3) && isSubBoxValid(board, 3, 3) && isSubBoxValid(board, 6, 3)
                && isSubBoxValid(board, 0, 6) && isSubBoxValid(board, 3, 6) && isSubBoxValid(board, 6, 6);
    }



    public static boolean isSubBoxValid(char[][] board, int r, int c) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char k = '1'; k<='9'; k++) {
            map.put(k, 0);
        }

        for(int i= 0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i+r][j+c] + " ");
            }
            System.out.print("\n");
        }


        for(int i= 0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i+r][j+c] != '.') {
                    int currentCount = map.get(board[i+r][j+c]);
                    if (currentCount > 0) {
                        return false;
                    }
                    map.put(board[i+r][j+c], currentCount + 1);
                }
            }
        }

        return true;
    }
}
