import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 
{

    public static List<List<Integer>> fourSum(int[] nums, int target)
    {
        if(nums == null || nums.length < 4)
        {
            return List.of(); // Return an empty list if input is invalid
        }
        // Sort the array to facilitate the two-pointer technique
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n -3; i++)
        {
            if(i > 0 && nums[i] == nums[i + 1])continue; // Skip duplicates for the first number

            long min1 = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if(min1 > target)break; // If the minimum possible sum is greater than target, break
            long max1 = (long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
            if(max1 < target)continue; // If the maximum possible sum is less than target

            for(int j = i + 1; j < n- 2; j++)
            {
                if(j > i + 1 && nums[j] == nums[j + 1])continue; // Skip duplicates for the second number


                
                
            // 1. min1 > target → break
            // This means:

            // The smallest possible sum we can get with current i and the next 3 smallest numbers is already greater than target.

            //  No need to keep checking — further values of i will only be larger (because array is sorted), making the sum even bigger.

            // So we break the loop entirely.
                long min2 = (long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
                if(min2 > target)break; // If the minimum possible sum is greater than target   



                //2. max1 < target → continue
                // This means:

                // The largest possible sum using current i and the 3 biggest values in the array is still smaller than target.

                //  So, no possible combination with current i can hit the target. But maybe future values of i (which are larger) can.

                // So we continue to the next i.

                long max2 = (long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2];
                if(max2 < target)continue; // If the maximum possible sum is less than target

                int left = j + 1;
                int right = n - 1;
                while(left < right)
                {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
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
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        // Skip duplicates for the third number
                        while(left < right && nums[left] == nums[left + 1])
                        {
                            left++;
                        }
                        // Skip duplicates for the fourth number
                        while(left < right && nums[right] == nums[right - 1])
                        {
                            right--;
                        }       
                        left++;
                        right--;
                    }
                }
            }
        } 
        return result; // Return the list of quadruplets
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println("Four Sum Result: " + result);
    }
    
}
