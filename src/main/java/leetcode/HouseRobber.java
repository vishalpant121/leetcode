package leetcode;

public class HouseRobber {


    public static void main(String[] args) {

        int[] nums = {2,2,1,2};

        System.out.println(rob_dynamic_programming(nums));
    }

    public  static int rob(int[] nums) {

       //recursive
        return rob_recursive(nums, nums.length -1);

    }

    public static int rob_dynamic_programming_efficient(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);


        int value1 = nums[0], max_val;
        int value2 = Math.max(nums[0], nums[1]);

        for(int i=2; i< nums.length; i++) {
            max_val = Math.max(value2, value1 + nums[i]);
            value1 = value2;
            value2 = max_val;
        }

        return value2;


    }

    public static int rob_dynamic_programming(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        int[] a = new int[n];

        a[0] = nums[0];
        a[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i< nums.length; i++) {
            a[i] = Math.max(a[i-1], a[i-2] + nums[i]);
        }


        return a[n-1];

    }

    public static int rob_recursive(int[] nums, int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return nums[0];

        return Math.max( rob_recursive(nums, n-1), nums[n] + rob_recursive(nums, n-2));
    }
}
