import java.util.Scanner;

public class Breakcontinuetask
{
    public static void main(String[] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        boolean p = true;
        while (p)
        {
            number = in.nextInt();
            if (number < 0)
            {
                System.out.println(" Its over");
                break;
            } else
                {
                System.out.println("Good Going");
            }
        }
    }
}
