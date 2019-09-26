package tengxunTest;

import java.util.*;

public class minTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        /*for(int i = 0; i < arr2.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr2.length;j++){
                if(arr2[j]<arr2[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr2, i, min);
                swap(arr1,i,min);
            }
        }*/
        sort(arr2,arr1);
        int res = 0;
        int t1 = 0;
        int t2 = arr2.length-1;
        while (t1<=t2){
            if (arr1[t1] <= 0){
                t1 ++;
                continue;
            }
            if (arr1[t2] <= 0){
                t2 --;
                continue;
            }
            if (res < arr2[t1]+arr2[t2]){
                res = arr2[t1]+arr2[t2];
            }
            arr1[t1]--;
            arr1[t2]--;
        }

        System.out.println(res);
    }
    public static void sort(int[] a,int[] b){
        if (a.length>0) {
            sort(a,b,0,a.length-1);
        }
    }
    public static void sort(int[] a,int[] b,int low,int height){
        int i=low;
        int j=height;
        if (i>j) {//放在k之前，防止下标越界
            return;
        }
        int k=a[i];
        while (i<j) {
            while (i<j&&a[j]>k) { //找出小的数
                j--;
            }
            while (i<j&&a[i]<=k) { //找出大的数
                i++;
            }
            if(i<j){//交换
                swap(a,i,j);
                swap(b,i,j);
            }

        }
        swap(a,i,low);
        swap(b,i,low);
        sort(a, b,low, i-1);
        //对右边进行排序
        sort(a,b,i+1,height);
    }
    private static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*private static Map<Integer,Integer> sortMap(Map<Integer,Integer> map){
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        return map;
    }*/
}
