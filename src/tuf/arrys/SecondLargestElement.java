package tuf.arrys;

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{8, 8, 7, 6, 5}));
    }
    public static int secondLargestElement(int[] nums) {
        int small=Integer.MAX_VALUE;
        int s_small=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<small)
            {
                s_small=small;
                small=nums[i];
            }
            else if(nums[i]<s_small && s_small!=small){
                s_small=nums[i];

            }

        }
        return s_small;

    }
}
