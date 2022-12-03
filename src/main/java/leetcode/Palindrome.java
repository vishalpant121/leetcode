package leetcode;

public class Palindrome {


    public static void main(String[] args) {


        int val = 10501;

        System.out.println(isPalindrome(val));
    }

    private static boolean isPalindrome(int val) {

        // Using String
        /*String s = Integer.toString(val);
        int i = 0, j= s.length() -1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;*/


        if(val == 0)
            return true;
        if(val < 0 || val%10 ==0)
            return false;
        int rev = 0;

        while (rev < val) {
            rev = rev*10 + val%10;
            val /= 10;
        }
        return (rev == val) || (rev/10 == val);

    }
}
