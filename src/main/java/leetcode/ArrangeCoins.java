package leetcode;

public class ArrangeCoins {

    public static void main(String[] args) {
       System.out.println(arrangeCoins(2147483647));

        System.out.println(Integer.MAX_VALUE);
    }

    public static int arrangeCoins(int n) {

        if(n == 1)
            return 1;

         long i=1, count = 1;
         int ans = 0;

        while(i <=n) {

            i = i + 1 + count;
            count++;
            ans+=1;
        }

        return ans;



    }
}
