package questions;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Input: nums = [1], target = 0
 * Output: -1
 */


public class RotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {1};
        int target = 0;

        System.out.println(findInRotatedSortedArray(arr, target));
    }

    public static int findInRotatedSortedArray(int[] arr, int target) {

        return searchingRotatedSortedArray(arr, target, 0, arr.length -1);
    }

    public static int searchingRotatedSortedArray(int[] arr, int target, int start, int end) {

        if(arr.length == 0) {
            return -1;
        }

        if(start >= end) {
            if(target == arr[start]) {
                return start;
            } else {
                return -1;
            }
        }

        int mid, result = -1;
        mid = (start + end) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        result = searchingRotatedSortedArray(arr, target, mid + 1, end);
        if(result != -1) {
                return result;
        } else {
                result = searchingRotatedSortedArray(arr, target, start, mid - 1);
        }


        return result;
    }
}
