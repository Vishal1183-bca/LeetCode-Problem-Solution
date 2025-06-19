import java.util.Arrays;

public class ThreeSumClosest 
{

    public static int threeSumClosest(int[] nums,int target)
    {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length -2; i++)
        {
            int left = i + 1;
            int right = nums.length-1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(closestSum - target))
                {
                    closestSum = sum;
                }
                if(sum < target)
                {
                    left++;

                }
                else if(sum > target)
                {
                    right--;
                }
                else
                {
                    return target; // If the sum is exactly equal to the target, return it immediately
                }
            }
        }
        return closestSum; // Return the closest sum found
    }
    public static void main(String[] args) {
        int[] nums2 = {-1, 2, 1, -4};
        int target = 1;     
        int closestSum = threeSumClosest(nums2, target);
        System.out.println("Three Sum Closest to " + target + ": " + closestSum);
    }
    
}
