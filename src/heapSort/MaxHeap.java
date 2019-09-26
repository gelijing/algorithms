package heapSort;

public class MaxHeap {
    private int[] arr;
    private int count;
    private int capacity;
    public MaxHeap(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        count = 0;
    }
    public int size(){
        return count;
    }
    public void insert(int num){
        assert count+1 <= capacity;
        arr[count] = num;
        shiftUp(count);
        count++;
    }
    public void shiftUp(int k){
        while (k >0 && (k-1)/2>=0 && arr[(k-1)/2]<arr[k] ){
            swap(arr,k,(k-1)/2);
            k = (k-1)/2;
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        int[] arr = new int[]{9,8,3,6,5,4,7,10};
        for(int i = 0; i < arr.length ; i++){
            maxHeap.insert(arr[i]);
        }
        for (int i = 0 ; i < maxHeap.size();i++){
            System.out.print(maxHeap.arr[i] +" ");
        }
    }
}
