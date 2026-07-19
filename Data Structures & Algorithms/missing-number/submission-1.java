class Solution {
    public int missingNumber(int[] nums) {
        /*int n=nums.length;
        int totalsum=0;
        for(int i=0;i<=n;i++)
        {
            totalsum=totalsum+i;
        }
        int actualsum=0;
        for(int num:nums)
        {
            actualsum+=num;
        }
        return totalsum-actualsum;
        */
        //sum=n*(n-1)/2;
        int xor=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            xor^=i;
            xor^=nums[i];
        }
        return xor;
    }
}
