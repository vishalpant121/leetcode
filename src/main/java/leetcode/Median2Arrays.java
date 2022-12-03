package leetcode;

class Median2Arrays {


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,7};
        int[] arr2 = {2,7,8,9,10};  // 1,2,2,3,7,7,8,9,10

        System.out.println(getMedian(arr1, arr2));

    }


    static double getMedian(int[] nums1, int[] nums2) {
        

        //Let us look at smaller array and run loop on that only
        int m= nums1.length, n= nums2.length;
        if(m>n) {
            return getMedian(nums2, nums1);
        }
        int start = 0;
        int end = m;

        //NoteL: Here start and end are not indices, in fact they represent position between indices.
        // So for array with length m, there will be m+1 such positions
        while(start <= end) {
            int pos1 = (start + end)/2;
            int pos2 = (m+n)/2 -pos1;
            
            int L1 = pos1 == 0? Integer.MIN_VALUE : nums1[pos1 -1];
            int L2 = pos2 == 0? Integer.MIN_VALUE : nums2[pos2 -1];
            int R1 = pos1 == m? Integer.MAX_VALUE : nums1[pos1];
            int R2 = pos2 == n? Integer.MAX_VALUE : nums2[pos2];

            if(L1 <= R2 && L2<= R1) {
                //array with Ps is sorted
                if((n+m) == 0)
                    return (Math.max(L1, L2) + Math.min(R1, R2))/2.0;
                else
                    return Math.min(R1, R2);
            } else if (L1 > R2) {
                end = pos1-1;
            } else 
                start = pos1+1;
            
        }

        return -1;
    }
 }