import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter array size");
        int n=scn.nextInt();
        int[] a=new int[n];
        System.out.println("enter array element");
        for(int i=0;i<a.length;i++)
        {
            System.out.println ("element "+i);
            a[i]=scn.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            int temp = a[i] + 1;
            for(int j=temp;j<100000;j++) {
                int temp1 = j,temp2=temp1;
                int rev = 0;
                while (temp1 > 0) {
                    int rem = temp1 % 10;
                    rev = (rev * 10) + rem;
                    temp1 /= 10;
                }
                if (rev == temp2) {
                    System.out.println(rev);
                    break;
                }
            }
        }
    }
}
