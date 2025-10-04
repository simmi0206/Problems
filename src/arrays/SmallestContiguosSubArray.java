package arrays;

public class SmallestContiguosSubArray {
    public static void main(String[] args) {
        int[] a={3,4,1,1,6};
        int s=8;
        int result=smallestContiguosSubArray(a,s);
        System.out.println(result);
    }

    private static int smallestContiguosSubArray(int[] a, int s) {
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        int windowStart=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            while(sum>=s)
            {
                minLength=Math.min(minLength,i-windowStart+1);
                sum-=a[windowStart];
                windowStart++;
            }
        }
        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }
}
