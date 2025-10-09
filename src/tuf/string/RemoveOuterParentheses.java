package tuf.string;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
    public static String removeOuterParentheses(String s){
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        int open=0;
        for(char c:ch)
        {
            if(c=='(')
            {

                if(open>0){
                    sb.append(c);
                }
                open++;
            }
            else {
                open--;
                if(open>0){
                    sb.append(c);
                }

            }
        }

        return sb.toString();

    }
}
