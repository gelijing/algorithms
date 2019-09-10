public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,5,7,8};
        int target = 7;
        int index = BinarySearch.binarySearch(arr,target);
        System.out.print(index);
    }
}
