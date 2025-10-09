package leetcode;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }
//    public static String reverseWords(String s) {
//        String[] a = s.trim().split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = a.length - 1; i >= 0; i--) {
//            if (a[i].length() > 0) {
//                sb.append(a[i]);
//                sb.append(" ");
//            }
//        }
//        return sb.substring(0, sb.length() - 1);
//
//    }

    public static String reverseWords(String s) {
        char[] chars = s.trim().toCharArray();
        reverse(chars, 0, chars.length - 1);

        int n = chars.length;
        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }

        // Clean up multiple spaces (can be done in same pass too)
        return new String(chars).replaceAll("\\s+", " ");
    }

    private static void reverse(char[] chars, int l, int r) {
        while (l < r) {
            char tmp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = tmp;
        }
    }
}
