import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {

        Student s1=new Student(100,"manju");
        Student s2=new Student(80,"mau");
        Student s3=new Student(60,"anju");
        Student s4=new Student(100,"manju");

        Set s=new HashSet();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        System.out.println(s);
    }
}
