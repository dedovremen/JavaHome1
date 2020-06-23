public class Main {

    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 1;
        int a3 = 0;
        System.out.println("Method 1");
        System.out.println(a1);
        System.out.println(a2);

       do {
           a3 = a1 + a2;
           a1 = a2;
           a2 = a3;
           System.out.println(a3);
       }
       while ((a1 + a2) < 1000);

        a1 = 0;
        a2 = 1;
        a3 = 0;
        System.out.println("Method 2");
        System.out.println(a1);
        System.out.println(a2);
       while ((a1 + a2) < 1000) {
           a3 = a1 + a2;
           a1 = a2;
           a2 = a3;
           System.out.println(a3);
       }

    }


}
