public class Rectangle
{

    int length, breadth;

    public Rectangle()
    {
        length = breadth =0;
        System.out.println(area());
    }
    public Rectangle(int val)
    {
        length= breadth = val;
        System.out.println(area());

    }
    public Rectangle(int length, int breadth)
    {
        this.length= length;
        this.breadth= breadth;
        System.out.println(area());
    }
    public int area()
    {
        int area = length*breadth;
        return area;

    }

    public static void main(String[] args)
    {
        Rectangle p1= new Rectangle();
        Rectangle p2= new Rectangle(25);
        Rectangle p3= new Rectangle(15,20);
    }
}
