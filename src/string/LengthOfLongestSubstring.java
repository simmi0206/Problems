package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int left=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength=Math.max(maxLength,i-left+1);

        }
        return maxLength;

    }
}
