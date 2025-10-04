package arrays;

import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        int[] a={1,2,3,2,2};
        totalFruit(a);

    }

    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> basket=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<fruits.length;i++)
        {
            basket.put(fruits[i],basket.getOrDefault(fruits[i],0)+1);
            while(basket.size()>2)
            {
                basket.put(fruits[left],basket.get(fruits[left])-1);
                if(basket.get(fruits[left])==0)
                {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            max=Math.max(max,i-left+1);
        }
        return max;

    }
}
