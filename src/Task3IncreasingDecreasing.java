import java.util.Scanner;

public class Task3IncreasingDecreasing
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        long num1,num2,num3;
        System.out.println("Enter the Numbers");
        num1= in.nextLong();
        num2= in.nextLong();
        num3= in.nextLong();

        if (num2 > num1 && num3 > num2)
        {
            System.out.println("INCREASING");
        }
        else if (num2 < num1 && num3 < num2)
        {
            System.out.println("DECREASING");
        }
        else
            {
            System.out.println("Neither increasing or decreasing");
        }
    }

}
