import java.util.Scanner;

public class Mathoperations {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two values");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        double result = 0;

        System.out.println("choose the option");
        char p = in.next().charAt(0);
        switch (p)
        {
            case 1:
            {
                result = num1 + num2;
                System.out.println(result);
            }
            break;
            case 2:
            {
                result = num1 - num2;
                System.out.println(result);
            }
            break;
            case 3:
            {
                result = num1 / num2;
                System.out.println(result);
            }
            break;
            case 4:
            {
                result = num1 * num2;
                System.out.println(result);
            }
            break;
            case 5:
            {
                result = (num1 + num2) / 2;
                System.out.println(result);
            }
            break;
        }
        if (result < 0)
        {
            System.out.println("oops option:" + p + "is returning negative number");
        }
    }
}
