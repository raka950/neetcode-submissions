public class Solution {
    public int maxArea(int[] heights) {
       int max = 0;
       int len = heights.length;
       for(int i = 0; i< len; i++ ){
        for(int j = i+1; j< len; j++){
          
          max =  Math.max(max,Math.min(heights[i],heights[j])*(j-i));
        }
       }
       return max;
    }
}