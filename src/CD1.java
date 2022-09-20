import java.util.Comparator;

public class CD1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Laptop c=(Laptop)o1;
        Laptop c1=(Laptop) o2;
        int res=c.model.compareTo(c1.model);
        if(res>0)return -1;
        else if (res<0) return +1;
        else return 0;


    }
}

