package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 13, 151, 160};
        int target = 8;

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[10];
        System.out.print("Enter array of size " + size +": ");
        for(int i= 0; i< size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter Target :");
        int target = input.nextInt();*/

        System.out.println(binarySearch(arr, target, 0, arr.length-1));
        System.out.println(BSRecursive(arr, target, 0, arr.length -1));
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(target == arr[mid])
                return mid;
            if(target > arr[mid])
                start = mid + 1;
            else
                end = mid -1;

        }
        return  -1;
    }


    static int BSRecursive(int[] arr, int target, int start, int end) {
        if(start <= end) {
            int mid;
            mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid])
                return BSRecursive(arr, target, mid + 1, end);
            return BSRecursive(arr, target, start, mid - 1);
        }
        return -1;
    }

}
