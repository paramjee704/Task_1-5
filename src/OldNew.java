public class OldNew
{
    public static void main(String[] args)
    {

        int i = 40;
        if (i % 2 != 0)
        {
            System.out.println("NEW");
        }
        else if (i % 2 == 0 && (i > 2 && i < 5))
        {
            System.out.println("OLD");
        }
        else if (i % 2 == 0 && (i > 6 && i < 30))
        {
            System.out.println("NEW");
        }
        else if (i % 2 == 0 && i > 30)
        {
            System.out.println("OLD");
        }
        else
            {
            System.out.println("WEIRD");
        }
    }
}
