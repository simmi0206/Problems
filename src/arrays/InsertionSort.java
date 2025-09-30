package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={1,2,7,5,8};
        InsertionSort i=new InsertionSort();
        printArray(a);
        i.sort(a);
        printArray(a);
    }

    private void sort(int[] a) {
        if (a.length==0 || a.length==1)
        {
            return;
        }
    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
