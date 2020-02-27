import java.util.Scanner;

public class Task3DisplayandSumofDigit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n, p, total=0, count=0 ;
        n = in.nextInt();
        System.out.println("Enter Long type number");

        while (n!=0)
        {
            p= n%10;
            n= n/10;
            total= total+p;
            count++;

        }
        System.out.println("Number of digits:" + count);
        System.out.println("sum of n natural numbers:" + total);
    }

}
