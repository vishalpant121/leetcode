package leetcode;

import java.util.Arrays;

class Threesum {

    public static void main(String[] args) {
        /*[1,1,1,0]
        -100*/


        int[] arr = {1,1,1,0};
        int target = -100;

        System.out.println(threeSumClosest(arr, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        
        int p1, p2, p3, rsum= 0, csum, diff = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        for(int i=0; i< nums.length -2; i++) {
            p1 = i;
            p2 = i+1;
            p3 = nums.length-1;
            while(p2<p3) {
            csum = nums[p1] + nums[p2] + nums[p3];
            if(Math.abs(target -csum) < diff) {
                diff = Math.abs(target -csum);
                rsum = csum;
            }
            if(csum > target) {
                    p3--;
            } else if(csum < target) {
                    p2++;
            } else 
                    return csum;
            }
            
        }
        
        return rsum;
    }
}