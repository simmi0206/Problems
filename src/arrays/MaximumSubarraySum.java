package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {9,9,9,3,4};
        int k=3;
        long max=maximumSubarraySum(nums,k);
        System.out.println(max);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long sum = 0;
        int left=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            while(set.contains(nums[i]))
            {
                sum-=nums[left];
                set.remove(nums[left]);
                left++;

            }

            set.add(nums[i]);
            sum+=nums[i];

            if(i-left+1>k)
            {
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }

            if(i-left+1==k && set.size()==k)
            {
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }




//    public static long maximumSubarraySum(int[] nums, int k) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        long windowSum = 0;
//        long maxSum = 0;
//        int windowStart = 0;
//
//        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
//            int currentNum = nums[windowEnd];
//
//            // Add current number to window sum and frequency map
//            windowSum += currentNum;
//            countMap.put(currentNum, countMap.getOrDefault(currentNum, 0) + 1);
//
//            // Shrink window if it exceeds size k
//            if (windowEnd - windowStart + 1 > k) {
//                int leftNum = nums[windowStart];
//                windowSum -= leftNum;
//                countMap.put(leftNum, countMap.get(leftNum) - 1);
//                if (countMap.get(leftNum) == 0) {
//                    countMap.remove(leftNum);
//                }
//                windowStart++;
//            }
//
//            // Check if window is size k and all elements are distinct
//            if (windowEnd - windowStart + 1 == k && countMap.size() == k) {
//                maxSum = Math.max(maxSum, windowSum);
//            }
//        }
//
//        return maxSum;
//
//
//    }
}
