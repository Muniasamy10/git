import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Scanner scn=new Scanner(System.in);

        //int k=scn.nextInt();

        int k=808;

        while(k>0)
        {
            int temp=++k;
            int temp1=temp;
           int rev=0;
            while(temp>0) {

                int rem = temp % 10;
                rev = (rev * 10) + rem;
                temp/=10;
            }
            if (rev == temp1) {
                System.out.println(k);
                break;
            }

        }
//        while(true)
//        {
//            ++k1;
//            int rev=0;
//            while(k1>0) {
//                int rem = k1 % 10;
//                rev = (rev * 10) + rem;
//            }
//            if (rev == k1) {
//                System.out.println(k1);
//                break;
//            }
//        }





    }
}
