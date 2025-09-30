package string;

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        String s="Hello I am Simran";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]== 'o' || c[i]=='O')
            {
                c[i]='r';
            }
        }
        System.out.println(c);
    }
}
