package leetcode;

import java.util.Arrays;

public class Search2DMatrix {

    public static void main(String[] args) {



        //int[][] matrix = { {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       int[][] matrix = { {-5}};
        int target =-5;

        System.out.println(searchMatrix(matrix, target));


        System.out.println(matrix.length + " " + matrix[0].length);
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        int startRow, startCol, endRow, endCol, midRow, midCol;
        startRow = 0;
        startCol = 0;
        endRow = matrix.length -1;
        endCol = matrix[0].length -1;


        while(startRow <= endRow && startCol <= endCol) {
            midRow = startRow + (endRow-startRow)/2;
            midCol = startCol + (endCol-startCol)/2;

            if(matrix[midRow][midCol] == target) {
                return true;
            } else if(matrix[midRow][midCol] <= target) {
                if(startRow < matrix.length -1 )
                    startRow = midRow+1;
                if(startCol < matrix[0].length -1)
                    startCol = midCol+1;
                if(startRow != midRow+1 && startCol != midCol+1)
                    return false;
            } else {
                if(endRow > 0 )
                    endRow = midRow-1;
                if(endCol > 0)
                    endCol = midCol-1;
                if(endRow != midRow-1 && startCol != midCol-1)
                    return false;
            }
        }

        return false;

    }
}
