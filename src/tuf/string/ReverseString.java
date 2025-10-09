package tuf.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Akshat"));

    }
//    public static String reverse(String s){
//        char[]  chars=s.toCharArray();
//        int left=0;
//        int right=chars.length-1;
//        while(left<right)
//        {
//            char temp=chars[left];
//            chars[left]=chars[right];
//            chars[right]=temp;
//            left++;
//            right--;
//
//        }
//        return new String(chars);
//
//    }

    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }


}
