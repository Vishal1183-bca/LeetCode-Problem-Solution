import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++)
        {
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 && nums[i] == nums[i -1]) continue; // skip duplicates
            while(left <  right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0)
                {
                    left++;
                }
                else if(sum > 0)
                {
                    right--;
                }
                else
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++; // skip duplicates
                    while(left < right && nums[right] == nums[right -1]) right--; // skip duplicates
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}