class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                res=nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return res;

    }
}
