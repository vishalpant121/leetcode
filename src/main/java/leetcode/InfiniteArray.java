package leetcode;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {

    public static void main(String[] args) {

        int[] nums = { 4, 4,4, 4, 4, 7, 4,2,1};

       // System.out.println(getPeakIndex(nums));
        System.out.println(getIndexMountain(nums, 4));
    }

    public static int getPeakIndex(int[] nums) {
        int start = 0, end = nums.length -1, mid;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid])
                return mid;
            else if(nums[mid -1] < nums[mid] && nums[mid+1] > nums[mid])
                start = mid + 1;
            else
                end = mid -1;
        }

        return -1;

    }


    public static int getIndexMountain(int[] nums, int target) {
        int start = 0, end = nums.length -1, mid, ans =-1;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(nums[mid] == target) {
                ans = mid;
                end= mid-1;
            }
            else if(target > nums[mid]) {
                // target is larger than the max element in the array
                if(mid >0 && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
                    return -1;
                if(mid == 0 || nums[mid] > nums[mid-1])
                    start = mid +1;
                else end= mid-1;
            } else {
                if(mid == 0 || nums[mid] < nums[mid-1])
                    start = mid +1;
                else end= mid-1;
            }
        }

        return ans;

    }
}
