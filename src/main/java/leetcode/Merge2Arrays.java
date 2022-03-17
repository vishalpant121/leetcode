package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {

        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 4, 5};
        int n = 5;

        old_merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, p=0;

        if(m == 0) {
            while (j<n) {
                nums1[j] = nums2[j];
                j++;
            }
            return;
        }

        if(m >= nums1.length) {
            return;
        }

        while(i< m) {
            nums1[m+i] = nums1[i];
            i++;
        }

        while(i< nums1.length && j<n) {
            if(nums1[i] <= nums2[j]) {
                nums1[p] = nums1[i];
                i++;
            } else {
                nums1[p] = nums2[j];
                j++;
            }
            p++;
        }

        while(j < n) {
            nums1[p] = nums2[j];
            j++;
            p++;
        }
        System.out.println(Arrays.toString(nums1));
    }



    public static void old_merge(int[] nums1, int m, int[] nums2, int n) {

        int[] num = new int[nums1.length];
        //we are actually creating a new array, and since java is pass by value this new array is not
        // going to be assigned to nums1 !! so since we don't actually convert nums1 -> wrong solution
        int i=0, j=0, p=0;
        while(i<m && j<n) {
            if(nums1[i] <= nums2[j]) {
                num[p++] = nums1[i];
                i++;
            } else {
                num[p++] = nums2[j];
                j++;
            }
        }

        while(i<m) {
            num[p++] = nums1[i];
            i++;
        }

        while(j<n) {
            num[p++] = nums2[j];
            j++;
        }

        i= 0;
        while(i< nums1.length) {
            nums1[i] = num[i];
            i++;
        }
        System.out.println(Arrays.toString(nums1));
    }



}
