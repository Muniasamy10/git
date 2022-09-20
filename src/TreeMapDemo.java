import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMapDemo {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put("nellai exp",1900);
        hm.put("scthu exp",2100);
        hm.put("vaigai exp",1600);
       // System.out.println(hm);
        Set s=hm.entrySet();
        //System.out.println(s);
        Iterator itr=s.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }


        while(itr.hasNext())
        {
            Object o= itr.next();
            Map.Entry e=(Map.Entry)o;
            Object time=e.getValue();
            if(time.equals(2100)) e.setValue(2300);
            Object expName=e.getKey();


        }
        System.out.println(s);
    }
}
