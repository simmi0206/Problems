package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    //Fixed array integer
    public static int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // stores last seen positions of characters
        int maxLen = 0;
        int left = 0; // left boundary of current window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // Move left pointer if char was seen before
            left = Math.max(left, index[c]);
            // Calculate max window size
            maxLen = Math.max(maxLen, right - left + 1);
            // Store next valid position for this char
            index[c] = right + 1;
        }

        return maxLen;
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int left=0;
//        int max=0;
//        Set<Character> set=new HashSet<>();
//        for(int i=0;i<s.length();i++)
//        {
//            char c=s.charAt(i);
//            while(set.contains(c)){
//                char l=s.charAt(left);
//                set.remove(l);
//                left++;
//
//            }
//            set.add(c);
//            max=Math.max(max,i-left+1);
//        }
//        return max;
//    }

    //Hashmap
//    public static int lengthOfLongestSubstring(String s) {
//        int left=0;
//        int max=0;
//        Map<Character,Integer> map =new HashMap<>();
//        for(int i=0;i<s.length();i++)
//        {
//            char c=s.charAt(i);
//            while(map.containsKey(c))
//            {
//                char l=s.charAt(left);
//                map.put(l,map.get(l)-1);
//                if(map.get(l)==0)
//                {
//                    map.remove(l);
//                }
//                left++;
//            }
//
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//            max=Math.max(max,i-left+1);
//        }
//        return max;
//
//    }
}
