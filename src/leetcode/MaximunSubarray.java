package leetcode;

public class MaximunSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currsum=0;
        int startIndex=-1;
        int endIndex=-1;
        for(int i=0;i<n;i++)
        {
            if(currsum==0)
            {
                startIndex=i;
            }
            currsum+=nums[i];
            endIndex=i;
            if(currsum<0)
            {
                currsum=0;
            }
            maxSum=Math.max(maxSum,currsum);

        }
        System.out.println(startIndex);
        System.out.println(endIndex);
        return maxSum;
    }
}

//public int maxSubArray(int[] nums) {
//    //Kadane's Algorithm
//    int maxSum = nums[0];
//    int sum = 0;
//    for (int i = 0; i < nums.length; i++) {
//        sum = sum + nums[i];
//        maxSum = sum > maxSum ? sum : maxSum;
//        if (sum < 0) {
//            sum = 0;
//        }
//    }
//    return maxSum;
//}

//    public int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int maxSum = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++)
//        {
//            int currsum=0;
//            for(int j=i;j<n;j++)
//            {
//                currsum+=nums[j];
//                maxSum=Math.max(maxSum,currsum);
//            }
//        }
//        return maxSum;
//    }

//    public static int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int maxSum = Integer.MIN_VALUE;
//
//        // Three loops: i -> start, j -> end, k -> sum
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int currentSum = 0;
//                for (int k = i; k <= j; k++) {
//                    currentSum += nums[k];
//                }
//                maxSum = Math.max(maxSum, currentSum);
//            }
//        }
//        return maxSum;
//    }