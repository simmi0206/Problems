package arrays;

public class SearchElement {

    public static void main(String[] args) {
        int[] a={1,2,7,5,8};
        SearchElement s= new SearchElement();
        int position=s.searchElementInArray(a,7);
        if(position==-1)
        {
            System.out.println("Value doesn't exists in array");
        }
        else{
            System.out.println("Element "+ a[position]+" Found at position "+ position);
        }
        printArray(a);
    }

    public int searchElementInArray(int[] a, int value){
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==value)
            {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] a){
        System.out.println("Original Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

}
