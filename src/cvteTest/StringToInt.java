package cvteTest;

public class StringToInt {
    public static int[] stringtoInt(String[] strings){
        if (strings == null || strings.length <=0){
            return null;
        }
        int[] res = new int[strings.length];
        for (int i = 0 ; i < strings.length;i++){
            int sum = 0;
            char[] temp = strings[i].toCharArray();
            for (int j = 0; j < temp.length;j++){
                int k = temp[j] - 'A';
                if (k >= 26 || k < 0){
                    return null;
                }
                sum = sum*26 + k +1;
            }
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = stringtoInt(new String[]{"AB","B","C"});
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
