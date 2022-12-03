package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFfromSortedArray {

    public static void main(String[] args) {
        int[] nums = { };
        System.out.println(removeDuplicates(nums) + "\n" );
    }

    public static int removeDuplicates(int[] nums) {

        int it = 1, ptr = 0;
        if(nums.length == 0)
            return 0;

        while(it < nums.length) {
            if(nums[ptr] != nums[it]) {
                ptr++;
                nums[ptr] = nums[it];
            }
            it++;
        }
        return ptr+1;

    }
}
