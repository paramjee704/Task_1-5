import java.util.Scanner;

public class Task3LoopStat
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int num = 0, i, table;
        System.out.println("Enter number");
        num = in.nextInt();
        for (i = 1; i <= 10; i++)
        {
            table = num * i;
            System.out.println(num + " * " + i + "= " + table);
        }
    }
}
