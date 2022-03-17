package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = {0, 0};

        if(nums.length == 1) {
            return null;
        }

        for (int i=0; i<nums.length ; i++) {
            if(map.containsKey(target - nums[i])) {
                list[0] = map.get(target - nums[i]);
                list[1] = i;
                return list;
            }
            map.put(nums[i], i);
        }

        return null;

    }
}
