class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=i+1;
        int size=n;
        while(j<size)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                j++;
                
            }
            else
            {
                for(int k=j+1;k<size;k++)
                {
                    nums[k-1]=nums[k];
                    
                }
                size=size-1;
            }

        }
        return size;
    }
}