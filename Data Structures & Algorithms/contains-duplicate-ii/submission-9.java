class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     int n=nums.length;
    //    for(int i=0;i<n;i++)
    //    {
    //     for(int j=i+1;j<=Math.min(i+k,n-1);j++)
    //     {
    //         if(nums[i]==nums[j])
    //         {
    //             return true;
    //         }
    //     }
    //    }
    //    return false;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        if(map.containsKey(nums[i]))
        {
            int diff=Math.abs(i-map.get(nums[i]));
            if(diff<=k)
            {
                return true;
            }
        }
        map.put(nums[i],i);
    }
    return false;
    }
}