public class Programming {
    public Programming()
    {
        System.out.println("I love programming languages");
    }
    public Programming(String lang)
    {
        System.out.println("I love "  +  lang);
    }
    public static void main(String[] args)
    {
        Programming l1= new Programming();
        Programming l2= new Programming("Java");
        Programming l3= new Programming("python");
    }
}
