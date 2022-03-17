package leetcode;

public class MaximumSubArray {

    public static void main(String[] args) {


        int[] nums = {-4, -1, -1, -3};

        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        int currentMax, finalMax;
        currentMax = 0;
        finalMax = Integer.MIN_VALUE;

        if(nums.length == 1) {
            return nums[0];
        }

        for( int num: nums) {
            currentMax = currentMax + num;
            if(currentMax > finalMax) {
                finalMax = currentMax;
            }
            if(currentMax < 0) {
                currentMax = 0;
            }
        }

        return finalMax;
    }
}
