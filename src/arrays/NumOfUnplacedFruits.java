package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class NumOfUnplacedFruits {
    public static void main(String[] args) {
        int[] fruits={4,2,8};
        int[] baskets={3,5,4};
        int result=numOfUnplacedFruits(fruits,baskets);
        System.out.println(result);

    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        for(int i=0;i<fruits.length;i++)
        {
            boolean placed = false;
            for(int j=0;j<baskets.length;j++)
            {
                if(baskets[j]>=fruits[i])
                {
                    baskets[j]=-1;
                    placed=true;
                    break;
                }
            }
            if(!placed)
            {
                unplaced++;
            }
        }

        return unplaced;
    }

}
