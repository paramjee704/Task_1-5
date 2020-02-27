import java.util.Scanner;

public class Task3SumofNatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p, i, sum = 0;
        System.out.println("Enter Number");
        p = in.nextInt();

        for (i = 1; i <= p; p++) {
            sum += i;
        }
        System.out.println("Sum of Natural Numbers:" + sum);
    }
}
