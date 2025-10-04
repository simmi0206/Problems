package arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraysOfDistinct {
    public static void main(String[] args) {
        int[] a={4,4,3};
        int k=3;
        int n= SubarraysOfDistinctElements(a,k);
        System.out.println(n);
    }

    private static int SubarraysOfDistinctElements(int[] a, int k) {
        int count=0;
        int windowstart=0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i =0;i<a.length;i++)
        {
            freq.put(a[i], freq.getOrDefault(a[i],0)+1);
            if(i-windowstart+1>k)
            {
                int left=a[windowstart];
                freq.put(left,freq.get(left)-1);
                if(freq.get(left)==0)
                {
                    freq.remove(left);
                }
                windowstart++;
            }
            if(i-windowstart+1==k && freq.size()==k)
            {
                count++;
            }

        }
        return count;
    }
}
