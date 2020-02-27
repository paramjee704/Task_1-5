import java.util.Scanner;

public class Divisible {
    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);
        int i= in.nextInt();
        if(i%3==0)
        {
            System.out.println("consultadd");
        }
        if(i%5==0)
        {
            System.out.println("Java training");
        }
        if (i%3==0 && i%5==0)
        {
            System.out.println("Consultadd Java training");
        }
    }
}
