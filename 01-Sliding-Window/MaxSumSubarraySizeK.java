public class MaxSumSubarraySizeK {
    public static int findMaxSum(int[] nums, int k) {
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // expand window

            // shrink window when size exceeds k
            if (right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            // update maxSum when window size is exactly k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(findMaxSum(nums, k)); // Output: 9
    }
}
