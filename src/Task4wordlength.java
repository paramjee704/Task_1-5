import java.util.Scanner;

public class Task4wordlength {
    public static void main(String[] args) {
        String s = "My name is Param";
        int len = s.length();
        String shortest = "", word = "";
        String words[] = new String[100];
        int i, length = 0;
        for (i = 0; i < len; i++)
        {
            if (s.charAt(i) != ' ')
            {
                word += s.charAt(i);

            } else {
                words[length] = word;
                length++;
                word = "";
            }
            shortest = words[0];
        }
        for (i = 0; i < length; i++)
        {
            System.out.println(shortest.length() + " : " + words[i].length());
            if (shortest.length() > words[i].length())
            {
                shortest = words[i];
            }
        }
        System.out.println("Shortest value: " + shortest);


    }

}