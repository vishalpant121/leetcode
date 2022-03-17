package leetcode;

import java.util.Arrays;

public class MatrixReshape {


    public static void main(String[] args) {

        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;

        System.out.println((Arrays.deepToString(matrixReshape(mat, r, c))));


    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] arr = new int[r][c];

        if(mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[] singleArray = new int[mat.length * mat[0].length];
        int k = 0;
        for(int i=0; i< mat.length ; i++) {
            for(int j=0; j< mat[0].length ; j++) {
                singleArray[k] = mat[i][j];
                k++;
            }
        }

        k = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = singleArray[k];
                k++;
            }
        }


        return arr;
    }
}
