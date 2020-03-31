import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(printNo(n,m));
    }

    public static ArrayList<Integer> printNo(int n, int m){
        boolean[] persons=new boolean[n];
        int code=1;
        int idx=0;
        int size=n;
        ArrayList<Integer> res = new ArrayList<>();
        //剩下的数没有就结束循环
        while(size>0){
            if(!persons[idx]){//剩下的合法数
                if(code==m){
                    persons[idx]=true;
                    //System.out.println( idx+1);
                    res.add(idx+1);
                    code=0;//重新计数（下面会加1,所以这里设置为0)
                    size--;//找到一个后总大小减1
                }
                code++;//合法的数编号增1
            }
            idx++;//数组下递增，如果到结尾，就重置idx，重新从开始循环
            if(idx==n){
                idx=0;
            }
        }
        return res;
    }



    public static long str16HexToDigit(String str){
        int len = str.length();
        long sum = 0;
        for(int i = 0; i<len;i++){
            char c = (char)str.charAt(len-1-i);
            int n = Character.digit(c,16);
            sum += n*(1<<(4*i));
        }
        return sum;
    }

    private static int core(String[] arr) {
        int len = arr.length;
        int[] a = new int[len];
        int[] f1 = new int[len];
        int[] f2 = new int[len];
        for(int i = 0 ; i < len ;i++){
            a[i] = Integer.valueOf(arr[i]);
        }
        for(int i=0;i<len;i++){
            f1[i] = 1;
            for(int j = 0;j <i;j++){
                if(a[i]>a[j]&&f1[i]<f1[j]+1){
                    f1[i] = f1[j]+1;
                }
            }
        }
        for (int i = len-1;i>=0;i--){
            f2[i] = 1;
            for(int j = i;j<len;j++){
                if (a[i] > a[j] && f2[i]<f2[j]+1) {
                    f2[i] = f2[j]+1;
                }
            }
        }
        int ans = 0;
        for(int i = 0;i < len;i++){
            if (ans < f1[i] + f2[i] -1) {
                ans = f1[i] + f2[i]-1;
            }
        }
        return len-ans;
    }

}
