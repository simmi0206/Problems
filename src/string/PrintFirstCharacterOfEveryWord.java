package string;

public class PrintFirstCharacterOfEveryWord {
    public static void main(String[] args) {
        String s="Hello I am Simran";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!= ' ' && (i==0 || s.charAt(i-1)==' ')){
            System.out.print(s.charAt(i)+" ");
            }
        }
    }
}
