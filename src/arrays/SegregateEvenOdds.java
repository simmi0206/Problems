package arrays;
//Time Complexity: O(n)
//Space Complexity: O(1)
public class SegregateEvenOdds {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        segregate(a);
        printElements(a);
    }

    private static void swapElements(int[] a,int left, int right) {
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }

    private static void printElements(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }

    private static void segregate(int[] a) {
        //Arrays.sort(a); brute force

        if(a.length<1)
        {
            return;
        }

        int left=0;
        int right=a.length-1;
        while(left<right)
        {

            if(a[left]%2==0 && left<right)
            {
                left++;
            }
            else if(a[right] % 2 != 0 && left<right)
            {
                right--;
            }
            else{
                swapElements(a, left,right);
                left++;
                right--;
            }
        }

    }
}
