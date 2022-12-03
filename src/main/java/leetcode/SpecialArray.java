package leetcode;

import java.util.Arrays;

public class SpecialArray {

    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {

        Arrays.sort(nums);

        int res = -1;
        for(int x=0; x< nums.length; x++) {

            res = checkCount(nums, x);

            if(res == x)
                return x;
        }
        return -1;
    }


    public static int checkCount(int[] nums, int x) {

        int count = 0;

        for(int i=0; i< nums.length; i++) {

            if (nums[i]>= x)
                return nums.length -i;
        }

        return -1;
    }
}
