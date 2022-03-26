package leetcode;

import java.util.HashMap;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {

        int n= 100;

        System.out.println(trailingZeroes(n));
    }


    public static long trailingZeroes(int n) {

        // floor technique
        int count = 0;
        for(int i=5; i<= n; i*=5) {
            count += n/ i;
        }
        return count;

    }
}
