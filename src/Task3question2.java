import java.util.Scanner;

public class Task3question2
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int val, i, sum = 0;
        float Avg = 0;
        System.out.println("Enter Ten numbers");
        for (i = 1; i <= 10; i++)
        {
            val = in.nextInt();
            sum = sum + val;
            Avg = (float) sum / 10;
        }

        System.out.println("Sum of Ten numbers: " + sum);
        System.out.println("Average of Ten numbers: " + Avg);
    }
}
