import java.awt.image.Kernel;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;
public class MApDemo {
    public static void main(String[] args) throws IOException {

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("/home/muniasamy.m/IdeaProjects/Arrays/src/test.properties");
        p.load(fis);
        System.out.println(p);

        p.setProperty("dosai","25");
        FileOutputStream fos=new FileOutputStream("/home/muniasamy.m/IdeaProjects/Arrays/src/test.properties");
        p.store(fos,"rate updated");
       }
}
