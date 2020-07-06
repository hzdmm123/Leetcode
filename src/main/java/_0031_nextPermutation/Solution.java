package _0031_nextPermutation;

/**
 * @author hzdmm123
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        //从后向前找到第一个降序i j  a[i]<a[j]
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 到这里获取的nums[i]<nus[i+1]

        //i+1:end 找到刚刚比nums[i]大的数
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            //  zhaodaole 1
            swap(nums, i, j);

        }
        reverse(nums, i + 1);


    }

    public void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

    }
}
