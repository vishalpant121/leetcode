package leetcode;

import java.util.HashSet;

public class HappyNumber {


    public static void main(String[] args) {

        System.out.println(" " +isHappy(5));

        /*for(int i=0; i< 100; i++) {
            System.out.println(i+" " +isHappy(i));
        }*/
    }


    public static boolean isHappyNew(int n) {

        if( n == 1 || n == 7)
            return true;

        int sum = n, temp;
        while(sum > 9) {

            temp = sum;
            sum = 0;
            while (temp > 0) {
                sum+=Math.pow(temp%10, 2);
                temp = temp/10;
            }

            if( sum == 1 || sum == 7)
                return true;

        }

        return false;
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> st = new HashSet<>();

        st.add(n);
        while(true) {

            int temp = n, sum = 0;
            while (temp > 0) {
                sum+=Math.pow(temp%10, 2);
                temp = temp/10;
            }

            if( sum == 1)
                return true;

            if( st.contains(sum))
                return true;

            st.add(sum);
        }
    }
}
