package arrays;
//Sliding window o(N)
public class ContinousK {
    public static void main(String[] args) {
        int[] a={2,1,5,1,3,2};
        int k=3;
        double[] result=printContinous(a,k);
        for(double res:result)
        {
            System.out.println(res);
        }

    }

    private static double[] printContinous(int[] a, int k) {
        int n=a.length;
        double[] result=new double[n-k+1];
        double sum=0.0;
        int windowStart=0;
        for(int windowEnd = 0; windowEnd<n; windowEnd++)
        {
            sum+=a[windowEnd];
            if(windowEnd>=k-1)
            {
                result[windowStart]=sum/k;
                sum-=a[windowStart];
                windowStart++;
            }
        }
        return result;

    }

    private static int printContinousMaxSum(int[] a, int k) {
        int n=a.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int windowStart=0;
        for(int windowEnd = 0; windowEnd<n; windowEnd++)
        {
            sum+=a[windowEnd];
            if(windowEnd>=k-1)
            {
                max=Math.max(sum,max);
                sum-=a[windowStart];
                windowStart++;
            }
        }
        return max;
    }
}
