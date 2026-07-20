class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans=0;
        while (i<j){
            int width=j-i;
            int curr=Math.min(heights[i],heights[j])*width;
            ans=Math.max(ans,curr);

            if (heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
        
    }
}
