package leetcode;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {


        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int target = 8;
        System.out.println(Arrays.toString(posOfElement(matrix, target)));

    }

    private static int[] posOfElement(int[][] grid, int target) {
        int r=0;
        if(grid.length == 0)
            return new int[]{-1, -1};
        int c= grid[0].length-1;

        while(r < grid.length && c>=0) {
            if(grid[r][c] == target)
                return new int[] {r,c};
            if(grid[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return new int[]{-1, -1};
    }
}
