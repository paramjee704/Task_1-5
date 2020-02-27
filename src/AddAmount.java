public class AddAmount {
    static int amount = 50,count= 0;

    public AddAmount()
    {
        count++;
        System.out.println("Final amount:" + this.amount);

    }
    public AddAmount(int p)
    {
        this.amount= this.amount + amount;
        count++;
        System.out.println("Final amount:" + this.amount);
    }
    public static int printTransaction()
    {
        System.out.println("Transaction:");
        return count;
    }
    public static void main(String[] args)
    {
        AddAmount p1= new AddAmount();
        AddAmount p2= new AddAmount(20);
        AddAmount p3= new AddAmount(100);
        AddAmount p4= new AddAmount(30);
        System.out.println(AddAmount.printTransaction());
    }


}
