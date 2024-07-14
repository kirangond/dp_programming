package com.array.duplicate.sorted;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize the counter for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; // Update the next unique element
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 1, 2,2,4};
        int length = solution.removeDuplicates(nums);

        System.out.print("Output: " + length + ", nums = [");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

