package streams;

public class CountOccurence {
    public static void main(String[] args) {

        String name="Simraan";
        char c='a';
        System.out.println(count(name,c));

    }

    public static long count(String name, char c){

        long c1=name.chars().filter(ch-> ch==c).count();
        return c1;
    }

}
