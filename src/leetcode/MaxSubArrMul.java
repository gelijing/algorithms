package leetcode;

/**
 * 最大子数组乘积
 */
public class MaxSubArrMul {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = nums[0];
        int minPro = nums[0];
        int min;
        int maxPro = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = minPro(nums[i], minPro * nums[i], maxPro * nums[i]);
            maxPro = maxPro(nums[i], minPro * nums[i], maxPro * nums[i]);
            minPro = min;
            res = Math.max(maxPro, res);
        }
        return res;
    }

    private int maxPro(int k, int i, int j) {
        k = Math.max(k, i);
        k = Math.max(k, j);
        return k;
    }

    private int minPro(int k, int i, int j) {
        k = Math.min(k, i);
        k = Math.min(k, j);
        return k;
    }
}
