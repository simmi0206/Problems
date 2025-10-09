package tuf.string;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Java Programming"));

    }
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        String[] words=s.split(" ");
        for(int i=0;i< words.length;i++)
        {
            String s1=words[i];
            if(s1.length()>0){
                sb.append(new StringBuilder(s1).reverse());
                sb.append(" ");
            }

        }
        return sb.substring(0,sb.length()-1);

    }
}
