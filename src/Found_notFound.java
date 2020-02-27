import java.util.Scanner;

public class Found_notFound
{
    public static void main(String[] args) {


        System.out.println("Enter character: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        char r = 'r', a = 'a', n = 'n', d = 'd', o = 'o', m = 'm';
        char R = 'R', A = 'A', N = 'N', D = 'D', O = 'O', M = 'M';
        if (ch == r || ch == a || ch == n || ch == d || ch == o || ch == m || ch == R || ch == A || ch == N || ch == D || ch == O || ch == M) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
