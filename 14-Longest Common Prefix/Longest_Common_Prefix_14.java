// Step 1: prefix = "flower"
// Compare with strs[1] = "flow"

// "flow".indexOf("flower") → returns -1 → not found

// So we shorten prefix: "flower" → "flowe" → still not found

// Continue until prefix = "flow" → "flow".indexOf("flow") = 0 → ✅ match

// Step 2: Compare with "flight"
// "flight".indexOf("flow") = -1

// "flight".indexOf("flo") = -1

// "flight".indexOf("fl") = 0 → ✅ match

// Now prefix = "fl" → ✅ answer.



public class Longest_Common_Prefix_14 
{
    public static String longestCP(String[] str)
    {
        if(str == null || str.length == 0)
        {
            return "";
        }
        String prefix = str[0];
        for(int i = 1; i < str.length; i++)
        {
            while(str[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;

    }
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String ans = longestCP(str);
        System.out.println("Longest Common Prefix is: " + ans);
    }
    
}
