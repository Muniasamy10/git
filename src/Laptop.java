

public class Laptop
{
   int price;
   int ram;
   String model;
   Laptop(int price, int ram, String model)
   {
       this.price=price;
       this.ram=ram;
       this.model=model;
   }
   public String toString()
   {
       return "price = "+price+"  model = "+model+"  ram ="+ram;
   }
}
