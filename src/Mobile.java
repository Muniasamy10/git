public class Mobile {
    String model;
    int price;
    int ram1;

    Mobile(String m,int p,int r)
    {
        model=m;
        price=p;
        ram1=r;
    }
    @Override
    public String toString()
    {
        return " "+ model +" "+ price +" "+ ram1;
    }
//    @Override
//    public int hashCode()
//    {
//        return price;
//    }
}
