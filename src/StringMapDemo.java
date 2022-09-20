import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMapDemo {
    public static void main(String[] args) {

       String name="vishalsubburam";
       HashMap <Character,Integer> hm=new HashMap<>();
       char[] a=name.toCharArray();
       for(char c:a)
       {
           if(hm.containsKey(c))
           {
               hm.put(c,hm.get(c)+1);
           }
           else
           {
               hm.put(c,1);
           }
       }
       System.out.println(hm);

        Set<Map.Entry<Character,Integer>> s=hm.entrySet();
        for(Map.Entry<Character,Integer> entry :s)
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+""+entry.getValue());
            }
        }

    }
}
