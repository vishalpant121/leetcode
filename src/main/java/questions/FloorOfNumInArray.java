package questions;

public class FloorOfNumInArray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        //expected answer 16.

        int result = getFloorOfElement(arr, target);
        System.out.println(result);

    }

    public static int getFloorOfElement(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;
        int mid;

        //if target is the smallest number then return -1
        if(target < arr[start])
            return -1;

        while (start <= end) {
            mid = start + (end -start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }


}
