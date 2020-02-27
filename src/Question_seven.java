import java.util.Scanner;

public class Question_seven {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter floating point number");

        float p = in.nextFloat();
        if (p == 0)
        {
            System.out.println("zero");
        } else
            {
            if (p > 0)
            {

                System.out.println("positive");
            } else
                {
                System.out.println("negative");
            }

        }
        if (Math.abs(p) < 1 || Math.abs(p) > 1000000) {
            System.out.println("small");
        }
    }

}

