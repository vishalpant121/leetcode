package leetcode;

import java.util.HashMap;

public class MajorityElement {


    public static void main(String[] args) {

        int[] nums = {2, 3, 3, 2, 3};

        System.out.println(anotherOne(nums));
    }


    public static int anotherOne(int[] nums) {

        int count = 0, candidate = -1;

        // Finding majority candidate
        for (int index = 0; index < nums.length; index++) {
            if (count == 0) {
                candidate = nums[index];
                count = 1;
            }
            else {
                if (nums[index] == candidate)
                    count++;
                else
                    count--;
            }
        }

        // Checking if majority candidate occurs more than
        // n/2 times
        count = 0;
        for (int num : nums) {
            if (num == candidate)
                count++;
        }
        if (count > (nums.length / 2))
            return candidate;
        return -1;

    }


    public static int majorityElement(int[] nums) {

        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
            if(map.get(num) > size/2)
                return num;
        }

        return 0;

    }

    public static int majorityElementOld(int[] nums) {

        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }

        for(Integer i: map.keySet()) {
            if(map.get(i) > size/2) {
                return i;
            }
        }

        return 0;

    }
}
