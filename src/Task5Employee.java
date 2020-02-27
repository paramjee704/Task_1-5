class Employee
{
    int year;
    String name, address;

    public Employee(String name, int year, String address)
    {
        this.name= name;
        this.year= year;
        this.address= address;
        System.out.println(name +" " + year + " " + address);;
    }

    public static void main(String[] args)
    {
        Employee E1= new Employee("Robert", 1994,"64C- Walls Street");
        Employee E2= new Employee("Sam", 2000,"68D- Walls Street");
        Employee E3= new Employee("John", 1999,"26B- Walls Street");
        System.out.println("Name"  +  "Year of Joining"  +  "Address");
    }

}
