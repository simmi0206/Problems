package arrays;

public class DeleteFromArray {

    public static int count=5;

    public static void main(String[] args) {
        int[] a={1,2,7,5,8};
        int val=7;

        DeleteFromArray d =new DeleteFromArray();
        //d.deleteFromEnd(a);
        //d.delete(a,val);
        //d.deleteFromPosition(a,2);

        printArray(a);
    }

    private void deleteFromPosition(int[] a, int position) {
        if(position>count || position<=0)
        {
            System.out.println("Invalid Position " +  position);
            return;
        }
        for(int i=position-1;i<count-1;i++)
        {
         a[i]=a[i+1];
        }
        count--;
    }

    private void delete(int[] a, int val) {
        int pos=0;
        for(int i=0;i<count;i++)
        {
            if(a[i]==val)
            {
                pos=i;
                break;
            }
        }

        if(pos==count)
        {
            System.out.println("value doesn't exists");
        }

        for(int i=pos;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        count--;
    }

    private void deleteFromEnd(int[] a) {
        if(a.length<0)
        {
            return;
        }
        count--;
    }

    public static void printArray(int[] a){
        for(int i=0;i<count;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

}
