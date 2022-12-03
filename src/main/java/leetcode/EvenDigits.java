package leetcode;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {

        int count = 0;
        for(int i=0; i< nums.length; i++) {
            if((((int) Math.log10(nums[i]) + 1) & 1) == 0) {
                System.out.println(nums[i] + " is even digited");
                count++;
            }
        }

        return count;
    }
}
