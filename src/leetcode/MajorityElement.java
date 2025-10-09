package leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }

    private static int majorityElement(int[] nums) {
        //Moore's Voting
        int n=nums.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                ele=nums[i];
                count=1;
            }
            else if(nums[i]==ele)
            {
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}

//o(n)2
//private static int majorityElement(int[] nums) {
//    int res=0;
//    int n=nums.length;
//    for(int i=0;i<n;i++)
//    {
//        int count=0;
//        for(int j=0;j<n;j++)
//        {
//            if(nums[i]==nums[j]){
//                count++;
//            }
//
//        }
//        if(count>n/2){
//            return nums[i];
//        }
//    }
//    return -1;
//}



//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > n / 2) {
//                return num;
//            }
//        }
//
//        return -1; // should never happen
//    }

