import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("vishal");
        al.add("xknx");
        al.add("ednc");
        al.add("ycrg");
        al.add(5);

        ListIterator itr=al.listIterator();

        while(itr.hasNext())
        {
           if( itr.next().equals(5))            {
               itr.set(100);
            }

        }
        System.out.println(al);


        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

    }
}
