import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        Mobile m1=new Mobile("Samsung",25000,8);
        Mobile m2=new Mobile("redmi",20000,6);
        Mobile m3=new Mobile("oppo",21000,8);

        java.util.HashMap hm=new java.util.HashMap();
        hm.put(124,m1);
        hm.put(122,m2);
        hm.put(123,m3);
       // System.out.println(hm);
        Set s=hm.entrySet();
        Iterator itr=s.iterator();

        while(itr.hasNext())
        {

            Map.Entry me=(Map.Entry)itr.next();
            Object o=me.getKey();
            Object o1=me.getValue();
            Mobile mo=(Mobile)o1;
            if(mo.equals(m1))
            {
                mo.price=1000;
            }


        }
        System.out.println(hm);

    }
}
