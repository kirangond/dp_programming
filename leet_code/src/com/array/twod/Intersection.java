package com.array.twod;

public class Intersection {

	public static void main(String[] args) {
		int[] nums1= {4,9,5};
		// TODO Auto-generated method stub
		int[] nums2= {9,4,9,8,4};
		int[] temp = new int[Math.min(nums1.length, nums2.length)];
		int k=0;
		 int[] result = new int[k];

		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					temp[k]=nums1[i];
					k++;
					break;
				}
			}
		}
		 System.arraycopy(temp, 0, result, 0, k);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}

	}

}
