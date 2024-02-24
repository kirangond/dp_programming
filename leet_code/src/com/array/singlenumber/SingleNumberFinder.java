package com.array.singlenumber;

public class SingleNumberFinder {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
 ///xor used to cancelling of same elements occuring twice
        for (int i = 0; i < nums.length; i++) {
            // XOR each element in the array
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 4, 1, 5, 4};
        int singleNumber = findSingleNumber(nums);

        System.out.println("The single number is: " + singleNumber);
    }
}
