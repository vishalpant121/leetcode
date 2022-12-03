package leetcode;

public class FindInMountainArray {


     // This is MountainArray's API interface.
     // You should not implement it, or speculate about its implementation
     static class MountainArray {
         int[] array = {4,4,4,4,4,5,3,1};
         public int get(int index) { return array[index];}
         public int length() {
             return 7;
         }

         MountainArray() {}
    }


    public static void main(String[] args) {
        int[] nums = { 4, 4,4, 4, 4, 7, 4,2,1};

        MountainArray mountainArray = new MountainArray();
        System.out.println(findInMountainArray(4, mountainArray ));
    }


    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length()-1, mid, ans =-1;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(mid ==0) {
                if(mountainArr.get(mid) == target)
                    ans = mid;
                return ans;
            }
            int arrayMid =mountainArr.get(mid);
            int arrayMidBelow = mountainArr.get(mid-1) ;
            int arrayMidAbove = mountainArr.get(mid+1) ;
            if(mountainArr.get(mid) == target) {
                ans = mid;
                end= mid-1;
            }
            else if(target > arrayMid) {
                // target is larger than the max element in the array
                if( arrayMid > arrayMidBelow && arrayMid > arrayMidAbove)
                    return -1;
                if(arrayMid > arrayMidBelow)
                    start = mid +1;
                else end= mid-1;
            } else {
                // target is larger than the max element in the array
                if(mid >0 && arrayMid > arrayMidBelow && arrayMid > arrayMidAbove)
                    return -1;
                if(arrayMid < arrayMidBelow)
                    start = mid +1;
                else end= mid-1;
            }
        }

        return ans;

    }

}
