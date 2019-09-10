public class BinarySearch {
    //二分查找法
    public static int binarySearch(int[] arr,int target){
        if (arr == null || arr.length <= 0){
            return -1;
        }
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
