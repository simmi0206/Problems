package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //Array should be sorted here
        int[] a={1,2,5,7,8};
        BinarySearch s= new BinarySearch();
        int position=s.searchIndex(a,7,0,a.length-1);
        if(position==-1)
        {
            System.out.println("Value doesn't exists in array");
        }
        else{
            System.out.println("Element "+ a[position]+" Found at position "+ position);
        }
        printArray(a);
    }

    public int searchIndex(int[] a, int value,int start, int end){
        if(a.length==0 || start>end)
        {
            return -1;
        }
        int mid=(start+end)/2;
        if(value==a[mid])
        {
            return mid;
        }
        if(value<a[mid]){
           return searchIndex(a,value,start,mid-1);
        }
        if(value>a[mid])
        {
            return searchIndex(a,value,mid+1,end);
        }
       return 0;
    }

    public static void printArray(int[] a){
        System.out.println("Original Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
