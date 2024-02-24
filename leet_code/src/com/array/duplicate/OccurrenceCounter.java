package com.array.duplicate;

public class OccurrenceCounter {
    public static void printElementOccurrence(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1;  // Initialize count for each element

            // Compare the current element with all others
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }

            // Print the count for the current element
            System.out.println("Element " + nums[i] + " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 4, 1, 5, 4};
        printElementOccurrence(nums);
    }
}

