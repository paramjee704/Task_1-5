public class Task4Replaceblankspave
{
    public static void main(String[] args)
    {
        String str = "Hello My Name is Param ";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
