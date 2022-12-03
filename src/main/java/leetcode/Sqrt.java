package leetcode;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
        System.out.println(mySqrt2(2147395599));

    }


    public static int mySqrt(int x) {
        //kese krun?

        if(x==0)
            return 0;

        int start = 1, mid;
        int end = x, ans =1;

        while(start<= end) {
            mid = start + (end-start)/2;
            long sq = (long) (mid) * (mid);

            if(sq  == x)
                return mid;
            else if(sq > x) {
                end = mid-1;
            } else {
                ans = mid;
                start = mid+1;
            }
        }

        return ans;
    }

    public static int mySqrt2(int n) {
        long lo=0,hi=n;
        long ans=0;
        while(lo<=hi)
        {
            long mid=(lo+hi)/2;
            if(mid*mid<n)
            {
                lo=mid+1;
                //mid*mid chota hai to usko equal laane ke lie lo ko badhao
                ans=mid;
            }
            else if(mid*mid>n) hi=mid-1;
            else return (int)mid;
        }
        return (int)ans;
    }
}
