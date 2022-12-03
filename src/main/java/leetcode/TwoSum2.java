package leetcode;

import java.util.Arrays;

public class TwoSum2 {

          public static void main(String[] args) {
            int[] nums = {5, 25,75};
            int target = 100;

            System.out.println(Arrays.toString(twoSum(nums, target)));
        }
        public static int[] twoSum(int[] numbers, int target) {


            // What we can do is for each elemnt do a BS for the  complementary element
            //if found return else contine
            //total time completixy is O(nlogn)

            for(int i=0; i< numbers.length-1; i++) {

                int newTarget = target - numbers[i];

                int[] ans = binarySearch(numbers, newTarget, numbers[i], i+1, numbers.length-1);

                if(ans[0] != -1 && ans[1] !=-1)
                    return ans;

            }

            return new int[] {-1, -1};

        }


        static int[] binarySearch(int[] numbers, int target, int comp, int start, int end) {

            int pos,mid, ans;
            pos = start-1;
            while(start <= end) {
                mid = start + (end - start)/2;
                if(numbers[mid] == target)
                    return new int[] { pos+1, mid+1};
                if(numbers[mid] < target)
                    start = mid+1;
                else
                    end = mid -1;
            }

            return new int[] {-1, -1};
        }

}
