package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {2};

        int val = 2;
        int k = getClean2(nums, val);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    private static int getClean2(int[] nums, int val) {
        int pos = 0;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;

    }
    private static int getClean(int[] nums, int val) {

        int i;
        for(i=0; i<nums.length; i++) {

            if(nums[i] == val) {
                int j = i+1;
                while (j< nums.length) {
                    if(nums[j] != val) {
                        swap(nums, i, j);
                        break;
                    }
                    j++;
                }
                if(j == nums.length)
                    return i;
            }

        }

        return i;

    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
