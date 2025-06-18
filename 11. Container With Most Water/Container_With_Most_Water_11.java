public class Container_With_Most_Water_11
{

    public static int findMaxArea(int[] height)
    {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right)
        {
            maxArea = Math.max((right - left /*width/* */) * (Math.min(height[left],height[right]) /*height*/), maxArea);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }   
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = findMaxArea(height);
        System.out.println(ans); // Output: 49
    }
}