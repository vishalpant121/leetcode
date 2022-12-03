package leetcode;

class CycleSort {

    public static void main(String[] args) {
        int[] arr = {5};

        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        
        
        //cyclic
        
        for(int i=0; i< nums.length;) {
            if(nums[i] != nums[nums[i] -1]) {
                swapElements(nums, i, nums[i] -1);
            } else 
                i++;
        }
        
        
        for(int i=0; i< nums.length; i++)
            if(nums[i]-1 != i)
                return nums[i];

        return -1;
        
    }
    
    public static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}