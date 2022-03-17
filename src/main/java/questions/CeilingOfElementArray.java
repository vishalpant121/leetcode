package questions;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfElementArray {


    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        //expected answer 16.

        int result = getCeilingsOfElement(arr, target);
        System.out.println(result);
    }

    public static void info() {
        //following code proves that (start+end)/2 is nto a good option
        // in fact that can create overflow and result of mid is comprmised.
        // better to use: start + (end - start)/2
        System.out.println(Integer.MAX_VALUE); //intmax is 2147483647
        int start, end, check1, check2, isloop;
        System.out.println("start:");
        start = 2147483646;  //intmax is 2147483647
        System.out.println("end:");
        end = 21474; // any number to bring start+end > limit
        check1 = start + (end - start) / 2;
        check2 = (start + end) / 2;
        System.out.println(check1 + " " + check2);
        // 1073752560 -1073731088
    }

    public static int getCeilingsOfElement(int[] arr, int target) {


        int mid, start = 0, end = (arr.length -1);

        //if target is the gratest number then return -1
        if(target > arr[end])
            return -1;

        while(start <= end) {
            mid = start + (end - start)/2;
            if(target == arr[mid])
                return mid;
            if(target > arr[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        return  start;
    }


}
