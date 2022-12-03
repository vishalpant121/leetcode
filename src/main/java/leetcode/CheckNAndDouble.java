package leetcode;

import java.util.Arrays;

public class CheckNAndDouble {


    public static void main(String[] args) {
        int[] arr = {-766,259,203,601,896,-226,-844,168,126,-542,159,-833,950,-454,-253,824,-395,155,94,894,-766,-63,836,-433,-780,611,-907,695,-395,-975,256,373,-971,-813,-154,-765,691,812,617,-919,-616,-510,608,201,-138,-669,-764,-77,-658,394,-506,-675,523};
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist2(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int start, target, end, mid, res = -1;

        for(int i = 0; i< arr.length; i++) {

            start  = 0;
            end = arr.length -1;
            target = 2* arr[i];

            while(start <= end) {
                mid = start + (end - start)/2;
                if(arr[mid] == target)
                    res = mid;
                if(arr[mid] < target)
                    start = mid+1;
                else
                    end = mid -1;
            }

            if(res != i && res !=-1 )
                return true;
        }

        return false;
    }


    public static boolean checkIfExist2(int[] arr) {

        // Intutively : we can run through the array (using a for loop) and for each element -> I will calculate 2*arr[i] ---> and then search it up in the array by calling a function --->search will be binary search to reduce time complexity

        //As, we are planning to use binary search we will first sort the array

        Arrays.sort(arr);

        int res;

        for(int i = 0; i<arr.length; i++)
        {
            res = check_binarySearch(arr, arr[i]*2);
            if(res != i && res != -1)
            {
                return true;
            }
        }

        return false;
    }

    public static int check_binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                System.out.println(arr[mid]);
                return mid;
            }
        }

        return -1;
    }
}

