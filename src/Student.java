public class Student {
    int mark;
    String name;
    Student(int m, String n)
    {
        mark=m;
        name=n;
    }
    @Override
    public int hashCode()
    {
        return mark;
    }
    @Override
    public boolean equals(Object arg)
    {
        if(!(arg instanceof Student))return false;
        Student s=(Student) arg;
        return name.equalsIgnoreCase(s.name)&&mark==s.mark;
    }
    @Override
    public String toString() {
        return "  "+name+mark;
    }
}
