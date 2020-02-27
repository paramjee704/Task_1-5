import java.util.Scanner;

public class Addnumbers {
    public static void main(String args[])
    {
        int x, y, z;

        System.out.println("Enter two integers and add their sum");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x + y;

        System.out.println("Sum of the integers = " + z);

        int result= z + 30;
        System.out.println("Final result:" + result);
    }
}
