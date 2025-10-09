package tuf.hashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentElement(new int[]{4, 4, 5, 5, 6}));
    }
    public static int mostFrequentElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq=0;
        int mostFrequent =Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int freq=entry.getValue();
            int num= entry.getKey();
            if(freq>maxFreq || (freq==maxFreq && num<mostFrequent))
            {
                maxFreq=freq;
                mostFrequent=num;
            }
        }

        return mostFrequent;
}
}
