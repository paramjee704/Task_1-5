public class Student
{
    public Student()
    {
        System.out.println("name unknown");
    }
    public Student(String name)
    {
        System.out.println("Name is:" + name);
    }

    public static void main(String[] args)
    {
        Student s1= new Student("Paramjeet Singh");
        Student s2= new Student();
    }
}
