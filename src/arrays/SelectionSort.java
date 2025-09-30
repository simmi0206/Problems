package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={1,2,7,5,8};
        SelectionSort b=new SelectionSort();
        printArray(a);
        b.sort(a);
        printArray(a);
    }

    private void sort(int[] a) {
    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
