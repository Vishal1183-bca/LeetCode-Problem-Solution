// 📍 First call: findsPositions(nums, 8, true) → Find first occurrence
// Loop 1:

// mid = (0 + 5) / 2 = 2

// nums[2] = 7 < 8, so search right → start = mid + 1 = 3

// Loop 2:

// mid = (3 + 5) / 2 = 4

// nums[4] = 8 == target

// Store ans = 4

// But since findIndex == true, search more left → end = mid - 1 = 3

// Loop 3:

// mid = (3 + 3) / 2 = 3

// nums[3] = 8 == target

// Store ans = 3

// Move left again → end = mid - 1 = 2

// Exit loop. start > end. First index = 3

// 📍 Second call: findsPositions(nums, 8, false) → Find last occurrence
// Loop 1:

// mid = 2, nums[2] = 7 < 8 → start = mid + 1 = 3

// Loop 2:

// mid = 4, nums[4] = 8 == target

// Store ans = 4

// Move right → start = mid + 1 = 5

// Loop 3:

// mid = 5, nums[5] = 10 > 8 → end = mid - 1 = 4

// Exit loop. Last index = 4



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
