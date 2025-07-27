// LC 167 - Two Sum II - Input Array is Sorted
// Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class LC167_TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // 1-based indexing as per LeetCode requirement
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // If no solution found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
