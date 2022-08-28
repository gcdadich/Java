import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world I am Gc Dadich");
        System.out.println("I Am Enginer\n");
        byte age =39;
        int phone =1234567890;
        long phone2 =12345678900L;
        float pi = 3.14F;
        char letter = 'A';
        boolean isAdult =false;
 //non primitive typ
        String name = new String("gc dadich1091");
        String friend = new String("akku");
        System.out.println(name.length());
//              Strings
//              concatenate
       String name1 = "Aman";
        String name2 = "akkuuuu";
        String name3 = name1 + "and" + name2;
       System.out.println(name1.charAt(0));
        System.out.println(name2.length());
        //replace

        //substring
        String Neame = "aman and akku";
        System.out.println(name.substring(0,10));
    // array
        int Age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;
        int[] marks = new int[3];
        marks[0] =97;
        marks[1] =98;
        marks[2] =95;
        //System.out.println(marks[0]);
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
           int[] Marks = {97,98,95};
           int[][] finalmark ={{97,98,95},{95,95,98}};
        System.out.println(finalmark[1][1]);
          //casting
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        int p =100;
        int fp =p + (int)18.18;
        System.out.println(fp);
        //constants

        //operators


    }
}