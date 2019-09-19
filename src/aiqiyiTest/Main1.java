package aiqiyiTest;

import java.util.Scanner;

/**
 * 首先给出一个长度为k=2^n（其中n为正整数）的序列A={a1，a2…a_{k-1},ak}，我们定义一个值v，
 * 这个值是由如下计算方法得到的，首先将A序列的第 i 位和第 i+1 位进行 OR 操作得到新数列A‘，
 * 然后再对A’序列操作，将A’ 序列的第 i 位和第 i+1 位进行 XOR 操作得到A‘’，对A‘’按照第一次
 * 操作方式进行OR操作，因为序列长度为2^n,所以显然进行n次操作之后就只剩下一个数字了，此时这个数字就是v。
 * 例如A={1，2，3，4}，第一次操作之后为{1|2=3，3|4=7}，第二次操作后，{3^7=4},所以v=4。
 *
 * 但是显然事情并没有那么简单，给出A序列后，还有m个操作，每个操作表示为“a b”，
 * 表示将A[a]改为b，之后再对A序列求v值。（注意每一次对序列的修改的永久的，
 * 即第i次修改是建立在前i-1次修改之上的）
 *
 * 输入第一行包含两个正整数n，m，分别表示A序列的长度为2^n,操作数量为m。（1<=n<=17,1<=m<=10^5）
 *
 * 输入第二行包含n个正整数，中间用空格隔开，表示A序列。（0<=ai<=2^30）
 *
 * 接下来有m行，每行包含两个正整数a，b，表示一次操作，即把A[a]变成b。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[1<<n];
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[][] arrA = new int[m][2];
        for (int i = 0 ; i < m;i++){
            for (int j = 0; j < 2; j++){
                arrA[i][j] = sc.nextInt();
            }
            arr[arrA[i][0]] = arrA[i][1];
        }
        System.out.println(result(arr));
    }

    private static int result(int[] arr) {
        if (arr == null || arr.length <=0){
            return 0;
        }
        while (arr.length>1){
            int[] tempArr = new int[arr.length/2];
            int k = 0;
            for (int i = 0 ; i < arr.length; i= i+2){
                tempArr[k++] = arr[i]|arr[i+1];
            }
            arr = new int[tempArr.length/2];
            int m = 0;
            for (int i = 0 ; i < tempArr.length; i= i+2){
                arr[m++] = tempArr[i]^tempArr[i+1];
            }
        }
        if (arr.length == 1){
            return arr[0];
        }
        return 0;
    }
}
