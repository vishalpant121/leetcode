package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionofArrays {


    public static void main(String[] args) {

        int[] nums1 = {};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));


    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> num = new ArrayList<>();

        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0] ;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int nu:nums1) {
            if(map.containsKey(nu)) {
                map.put(nu, map.get(nu) + 1);
            } else {
                map.put(nu, 1);
            }
        }

        for(int mu:nums2) {
            if(map.containsKey(mu) && map.get(mu) >=1) {
                num.add(mu);
                map.put(mu, map.get(mu) - 1);
            }
        }

        //convert arraylist to integer list
        int[] answer = num.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
