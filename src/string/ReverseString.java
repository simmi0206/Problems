package string;

public class ReverseString {
    public static void main(String[] args) {
        String s="Utkarsh";
        int n=s.length();
        char[] s2=new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            s2[n-i-1]=s.charAt(i);
        }
        System.out.println(new String(s2));
    }
}
