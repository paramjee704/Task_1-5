public class Task4stringrepeatreverse {
    public static void main(String[] args)
    {
    String str = "Be Happy and Stay Motivated";
    int i, p, n = 0;
    String words[] = str.split(" ");
    String revStr = "";
    char ch[] = str.toCharArray();

		for (i = 0; i < ch.length; i++)
		{
        for (p = 0; p < ch.length; p++)
        {
            if (ch[i] == ch[p] && i != p)
            {
                n = 1;
            }
        }
    }
		if (n == 1)
            System.out.println(true);
		else
                System.out.println(false);

		for (i = 0; i < words.length; i++)
		{
        String word = words[i];
        String reverse = "";
        for (p = word.length() - 1; p >= 0; p--)
        {
            reverse = reverse + word.charAt(p);

        }
        revStr = revStr + reverse + " ";
    }

		System.out.println(revStr);

    }
}
