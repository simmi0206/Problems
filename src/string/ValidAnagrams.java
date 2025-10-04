package string;
import java.util.*;
public class ValidAnagrams {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);

        boolean result=Arrays.equals(ss,tt);
        if(result)
        {
            return true;
        }
        return false;

    }

    //checking anagrams of strings with a fixed character set (like lowercase English letters You scan each string once → O(n) Fixed-size array of 26 integers → O(1) space
    //No extra dynamic space dependent on input size
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())
//        {
//            return false;
//        }
//
//        int[] count = new int[26];
//        for(int i=0;i<s.length();i++)
//        {
//            count[s.charAt(i)-'a']++;
//            count[t.charAt(i)-'a']--;
//        }
//        for(int c:count)
//        {
//            if(c!=0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }


    //Any Unicode string → use HashMap → O(n) time, O(k) space → optimal for general case
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())
//        {
//            return false;
//        }
//
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<s.length();i++)
//        {
//            char ss=s.charAt(i);
//            char tt=t.charAt(i);
//            map.put(ss,map.getOrDefault(ss,0)+1);
//            map.put(tt,map.getOrDefault(tt,0)-1);
//
//        }
//        for(int c:map.values())
//        {
//            if(c!=0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
}
