package com.array.duplicate;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int nums[])
	{
	boolean result = false;
    
    for(int i=0;i<nums.length;i++)
    {
        int count=1;
        if(nums[i]!=Integer.MIN_VALUE)
        {
        for(int j=i+1;j<nums.length;j++)
        {
             if(nums[i]==nums[j])
             {
                 count++;
                 nums[j]=Integer.MIN_VALUE;
             }
        }
        
        }  
        
        if(count==2)
        {
            result=true;
             return result;
        }
        else
            result=false;
        
    }
    
      return result;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,2,3,1};
		 boolean containsDuplicate = false;
		try {
			containsDuplicate = containsDuplicate(nums);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("containsDuplicate: " + containsDuplicate);
	          
	          
	}

}
