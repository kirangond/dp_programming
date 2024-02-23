class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
       int temp[] = new int[n];
		 int d = 0;
        if(n>k)
        {
         for(int i=n-k;i<n;i++)
		{
			temp[d]=nums[i];
			d++;
		}
          
          for(int i=0;i<n-k;i++)
		{
			temp[d]=nums[i];
			d++;
		}
          
         for(int i=0;i<n;i++)
		{
			nums[i]=temp[i];
		}
          
        System.out.print("[");
          for(int i=0;i<n;i++)
          {
        	  System.out.print(nums[i]);
              if(i<n-1)
			System.out.print(",");
          } 
        System.out.println("]");
        }
        
    }
}