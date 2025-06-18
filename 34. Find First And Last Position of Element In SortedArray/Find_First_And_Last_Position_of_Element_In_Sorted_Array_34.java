public class Find_First_And_Last_Position_of_Element_In_Sorted_Array_34 
{

    public static int[] searchRange(int[] nums,int target)
    {
        int[] ans = {-1,-1};
        int first = findFirstPosistion(nums, target, true); // first position
        int last = findFirstPosistion(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans; 


    }

    public static int findFirstPosistion(int[] nums, int target,boolean findFirst)
    {
        int ans = -1;
        int start = 0; 
        int end = nums.length-1;
        while(start <= end)

        {
            int mid = start + (end - start)/2;
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                if(findFirst)
                {
                    end = mid -1;
                }
                else 
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println("First and Last Position: " + ans[0] + ", " + ans[1]);
    }
    
}
