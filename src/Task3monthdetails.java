import java.util.Scanner;

public class Task3monthdetails
{

    public static void main(String[] args)
    {
        System.out.println("Enter Month: ");
        Scanner in = new Scanner(System.in);
        int Month = in.nextInt();

        switch(Month)
        {
            case 1:case 3:case 5: case 7:case 8: case 10: case 12:
            System.out.println("Total days are 31.");
            break;
            case 2:
                System.out.println("Total days in a month is 29.");
                break;
            case 4:case 6: case 9: case 11:
            System.out.println("Total days are 30.");
            break;
            default:
                System.out.println("Invalid Details.");
        }


    }
}
