import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDEmo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(130);
        l.add(20);
        l.add(29);
        System.out.println(l);
        Set s=new TreeSet(l);
        System.out.println(s);
    }
}
