import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDem {
    public static void main(String[] args) {
        String s="abdkckdjdksccvrvr";
        Set s1=new HashSet();
        for(int i=0;i<s.length();i++)
        {
            s1.add(s.charAt(i));
        }
        for(Object o:s1)
        {
            System.out.println(o);
        }
    }
}
