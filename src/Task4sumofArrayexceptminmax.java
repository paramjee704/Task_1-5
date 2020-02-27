public class Task4sumofArrayexceptminmax
{
    public static void main(String[] args)
    {
        int num[] = { 1, 2, 3, 4, 5 };
        int sum = 0, n;
        int min = num[0];
        int max = num[0];
        for (n = 0; n < num.length; n++)
        {

            if (num[n] < min)
            {
                min = num[n];

            }
            else if (num[n] > max)
            {
                max = num[n];
            }
            sum = sum + num[n];

        }
        sum = sum - (max + min);
        System.out.println("Min: " + min + " Max: " + max);
        System.out.println("Sum:" + sum);
    }
}
