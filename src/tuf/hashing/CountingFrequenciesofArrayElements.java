package tuf.hashing;

import java.util.*;

public class CountingFrequenciesofArrayElements {
    public static void main(String[] args) {
        System.out.println(countFrequencies(new int[]{1, 2, 2, 1, 3}));

    }
    public  static  List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> result=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            result.add(Arrays.asList(entry.getKey(),entry.getValue()));
        }

        //how to iterate over hashmap
//        Iterator<Map.Entry<Integer, Integer>> iterator=map.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry<Integer,Integer> m=iterator.next();
//            if(m.getKey().equals(3))
//            {
//                System.out.println(3);
//            }
//        }

        return result;
    }
}
