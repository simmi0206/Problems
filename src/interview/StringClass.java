package interview;

import java.util.HashMap;
import java.util.Map;

public class StringClass {
    public static void main(String[] args) {
        String s="abbbcc";
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            sb.append(m.getKey());
            sb.append(m.getValue());
        }
        System.out.println(sb.toString());
    }

}
