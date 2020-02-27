public class Flowchart {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int avg=(a+b+c)/3;
        System.out.println("avg="+avg);
        if((avg > a) && (avg > b) && (avg > c) || avg > a && avg > b)
        {
            System.out.println("Avg is Higher than a,b,c");
        }
        else if(avg>a &&avg>c)
        {
            System.out.println("Avg is Higher than a,c");
        }
        else if(avg>b&& avg>c)
        {
            System.out.println("Avg is Higher than a,b");
        }
        else if(avg>a)
        {
            System.out.println("Avg is just Higher than a");
        }
        else if(avg>b)
        {
            System.out.println("Avg is just Higher than b");
        }
        else if(avg>c)
        {
            System.out.println("Avg is just Higher than b");
        }
    }
}
