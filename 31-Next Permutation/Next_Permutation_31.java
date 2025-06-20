// Suppose nums = [1, 2, 3, 6, 5, 4]

// Find the first decreasing element from the end (i.e., find i such that nums[i] < nums[i + 1]):

// Start from right: 6 > 5 > 4 — decreasing

// But 3 < 6 → we found the pivot at index 2 (nums[2] = 3)

// Find the next larger element from the end that is greater than nums[i]:

// From the end, find first number > 3 → it's 4 at index 5

// Swap them:

// Swap nums[2] and nums[5] → array becomes: [1, 2, 4, 6, 5, 3]

// Reverse the part after index i:

// Reverse subarray from index 3 to end → [6, 5, 3] → [3, 5, 6]

// Final result: [1, 2, 4, 3, 5, 6] ✅






public class Next_Permutation_31 
{

    public static void nextPermutation(int[] nums)
    {
        int n = nums.length;
        int i = n - 2;
        // Step 1: Find the first decreasing element from the end
        while(i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        if(i >= 0)
        {
            // Step 2: Find the element just larger than nums[i] to swap with
            int j = n - 1;
            while(j > i && nums[j] <= nums[i])
            {
                j--;
            }
            // Step 3: Swap the elements at i and j
            swap(nums,i,j);
        }
        reverse(nums,i + 1,n-1);

    }
    private static void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums,int start,int end)
    {
        while(start < end)
        {
            swap(nums,start++,end--);
            
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);  
        System.out.print("Next Permutation: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
