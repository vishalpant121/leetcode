package leetcode;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1,2};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0, end = nums.length -1, mid;

        while(start <= end) {
            mid = start + (end - start)/2;
            if(target > nums[mid]) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end =  mid - 1;
            } else
                return mid;
        }

        return start;

    }
}
