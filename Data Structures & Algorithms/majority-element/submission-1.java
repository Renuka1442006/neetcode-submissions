class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int n=nums.length;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet())
        {
            if(map.get(val)>n/2)
            {
                max=Math.max(max,val);
            }
        }
        return max;
    }
}