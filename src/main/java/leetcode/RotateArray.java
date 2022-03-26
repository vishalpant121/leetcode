package leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3, 4};
        int k =2;

        rotateNew(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateNew(int[] nums, int k) {
        //using gcd/hcf
        k = k % nums.length;
        int n= GCD.gcd(nums.length, k);

        System.out.println("gcd=" + n  + " k=" + k);

        for(int p=0; p < n; p++) {
           int temp = nums[p];
           int loc = nums.length - k + p;
           int i = p;
           while(true) {
               nums[p] = nums[loc];
               i = loc;
               loc -= k;
               if(loc < 0)
                   loc = nums.length + loc;
               if(loc == 0)
                   break;
           }

           nums[i] = temp;
        }


    }

    public static void rotateTempArray(int[] nums, int k) {

        if(k<=0) {
            return;
        }

        if(nums.length <=k) {

            rotateOneByOne(nums, k);
            return;
        }
        int[] arr = new int[k];
        int j=0;

        for(int i= nums.length -k; i<nums.length; i++) {
            arr[j] = nums[i];
            j++;
        }

        for(int i=nums.length -1 -k; i>= 0 ; i--) {
            nums[i+k] = nums[i];
        }

        for(int i=0; i<k; i++) {
            nums[i] = arr[i];
        }
    }

    public static void rotateOneByOne(int[] nums, int k) {

        int last;
        for(int i=0; i< k; i++) {
            last = nums[nums.length -1];

            //System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            for(int j= nums.length -1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
    }
}
