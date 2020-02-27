public class Not3and6 {
    public static void main(String[] args) {


        int i;
        for (i = 0; i < 6; i++) {
            if (i == 3 | i == 6)
                continue;
            System.out.println(i);

        }
    }
}

