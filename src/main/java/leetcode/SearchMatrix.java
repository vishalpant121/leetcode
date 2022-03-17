package leetcode;

public class SearchMatrix {

    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();

        int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        //int[][] matrix = {{1, 1}};
        int target = 3;

        //Integers in each row are sorted from left to right.
        //The first integer of each row is greater than the last integer of the previous row.

        System.out.println(searchMatrix.searchMatrix(matrix, target));

    }


    public boolean binarySearch(int[] array, int target) {

        if(array.length <= 1 ) {
            return array.length == 1 && target == array[0];
        }

        int mid, start = 0, end = array.length-1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if(array[mid] == target) {
                return true;
            }
            if(array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length <= 1 ) {
            return matrix.length == 1 && binarySearch(matrix[0], target);
        }

        int mid, start = 0, end = matrix.length-1;
        while (start <=end) {
            mid = start + (end - start)/2;
            if(matrix[mid][0] == target) {
                return true;
            }
            if(matrix[mid][0] < target) {
                if(matrix[mid][matrix[mid].length-1] < target)
                    start = mid + 1;
                else
                    return binarySearch(matrix[mid], target);
            } else {
                    end = mid - 1;
            }
        }

        return false;
    }
}
