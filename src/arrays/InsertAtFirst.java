package arrays;

public class InsertAtFirst {
    public static void main(String[] args) {
        int[] a={0,10,20,30,40};
        int val=90;
        int pos=2;
        //insertAtStart(a,val);
        inserAt(a,val,pos);
        printArray(a);
    }

    private static void inserAt(int[] a, int val, int position) {
        for(int i=a.length-1;i>position;i--){
            a[i]=a[i-1];
        }
        a[position]=val;
    }

    private static void insertAtStart(int[] a, int val) {
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=val;
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

}
