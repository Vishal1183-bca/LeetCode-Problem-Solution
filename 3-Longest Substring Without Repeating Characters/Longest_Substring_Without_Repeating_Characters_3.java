import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 
{

    public static int longestSubstringWRC(String str)
    {
        if(str.isEmpty())
        {
            return -1;
        }
        int left = 0,right = 0, maxLength = 0;
        HashSet<Character> seen = new HashSet<>();
        while(right < str.length())
        {
            if(!seen.contains(str.charAt(right)))
            {
                seen.add(str.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }
            else{
                seen.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int ans = longestSubstringWRC(str);
        System.out.println("Longest SubString Without Repeating Characters is: " + ans);
    }
    
}
