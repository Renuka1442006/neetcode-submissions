class Solution {
    public int maxArea(int[] heights) {
        int h=0;
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max=Integer.MIN_VALUE;
        while(i<j)
        {
            h=Math.min(heights[i],heights[j]);
            max=Math.max(max,h*(j-i));
            if(heights[i]<heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}
