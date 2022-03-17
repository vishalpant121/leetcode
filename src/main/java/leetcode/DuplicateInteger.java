package leetcode;

import java.util.HashMap;

public class DuplicateInteger {


    public static void main(String[] args) {


        int[] nums = {1,2,3,4};

        if(containsDuplicate(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if(nums.length <=1) {
            return false;
        } //adding this block reduced the runtime by half (12 ms to 6 ms) !!

        for (int num : nums) {

            if (map.containsKey(num) && map.get(num) == 1) {
                    return true;
            } else {
                map.put(num, 1);
            }
        }

        return false;

    }
}
