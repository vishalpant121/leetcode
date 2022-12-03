package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLast {

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int firstOccurrence = occurrence(nums, target, true);
        int lastOccurrence = occurrence(nums, target, false);
        return new int[] {firstOccurrence, lastOccurrence};
    }

    public static int occurrence(int[] nums, int target, boolean isFirst) {


        int start = 0, end = nums.length -1, mid = 0, ans = -1;

        while(start <= end) {
            mid = start + (end - start)/2;
            if(target > nums[mid]) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if(isFirst)
                    end = mid -1;
                else
                    start = mid +1;
            }
        }

        return ans;

    }



}
