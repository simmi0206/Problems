package string;

public class TrimString {
        public static void main(String[] args) {
            String s = "  Hello I am Simran   ";
            char[] a=s.toCharArray();
            int start=0;
            int end=s.length()-1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=' ')
                {
                    start=i;
                    break;
                }
            }
            for (int i = s.length()-1; i >0; i--) {
                if (s.charAt(i)!=' ')
                {
                    end=i;
                    break;
                }
            }
            int count=0;
            count=end-start+1;
            String s1= new String(a,start,count);
            System.out.println(s1);
        }
}
