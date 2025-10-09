package practical;

public class StringPool {
    public static void main(String[] args) {
        String s1="Java";
        String s2=s1;
        String s3=s1+"Programming";
//        System.out.println(s1==s2);
//        System.out.println(s2);
//        System.out.println(s3);


        String a1="Java";
        String a2="Java";
        String a0="Java";
        String a3= new String("Java");
        String a4= new String("Java");
        System.out.println(a1==a2);
        System.out.println(a1==a0);
        System.out.println(a2==a3);
        System.out.println(a3==a4);
        System.out.println(a3.equals(a4));
    }
}
