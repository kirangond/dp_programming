package com.array.duplicate.sorted;

public class Solution1 {
	
	public static void main(String[] args) {
		int[] nums = {1, 1,2,3,3};
        int length = removeDuplicates(nums);

        System.out.print("Output: " + length );
	}

	private static int removeDuplicates(int[] nums) {
		// TODO Auto-generated method stub
		int k = 1;
		if(nums.length==0)
		{
			return 0;
		}
		
		for(int i=1;i<nums.length;i++)
		{
		if(nums[i]!=nums[i-1])
		{
			k++;
		}
		}
		return k;
		
		
	}

}