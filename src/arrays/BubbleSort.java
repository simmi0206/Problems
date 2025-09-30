package arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a={1,7,6,2,0};
        BubbleSort b=new BubbleSort();
        printArray(a);
        b.sort(a);
        printArray(a);
    }

    private void sort(int[] a) {
        if (a.length==0 || a.length==1)
        {
            return;
        }

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
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
