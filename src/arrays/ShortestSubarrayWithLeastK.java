package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarrayWithLeastK {
    public static void main(String[] args) {
        int[] a={84,-37,32,40,95};
        int k=167;
        int result=shortestSubarrayWithLeastK(a,k);
        System.out.println(result);
    }

    private static int shortestSubarrayWithLeastK(int[] nums, int k) {
        int windowSize = nums.length+1;
        long  sum = 0;

        Deque<long[]> deque = new ArrayDeque<>();

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];

            while (!deque.isEmpty() && sum < deque.peekLast()[0]) {
                deque.removeLast();
            }
            deque.addLast(new long[]{sum, i});

            if(sum >=k) {
                windowSize = Math.min(windowSize, i+1);
            }

            while (!deque.isEmpty() && sum-deque.peekFirst()[0] >= k) {
                windowSize = Math.min(windowSize, i-(int)deque.peekFirst()[1]);
                deque.removeFirst();
            }
        }

        return windowSize == nums.length+1 ? -1 : windowSize;


    }

}
