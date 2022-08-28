import java.util.Scanner;

public class p {
    public static void main(String[] args) {
     //operator
//        int a = 1;
//        int b = 2;
//        double diff = a/b;
//        System.out.println(diff);
        //how to take input ?


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        int age = sc.nextInt();
       System.out.println(age);
        String name =sc.nextLine();
        System.out.println(name);
       // operators
        //logical operators
        //&&
        int a = 60;
        int b = 40;
        if(a<50 && b <50)
            System.out.println("both less than 50");
        else
            System.out.println("bouth are not less than 50");
        //||
         boolean isAdult = false;
         if (isAdult)
        System.out.println("is adult");
         else
             System.out.println("not adult");
        //Scanner sc =new Scanner(System.in);
//        // pen = 10 ,notbook = 40
//
        double Case = sc.nextDouble();
        if(Case < 10)  {
            System.out.println("cannot buy anything");
            System.out.println("get more case" );
        }

        else if(Case > 10 && Case < 40 ){
            System.out.println("can gaat 1 thing ");
        }

        else {
            System.out.println("can gat both");
        }
        //switch
        int day = 2;
        switch(day){
            case 1 :
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("wed - sun");
        }
     ////LOPES

        for(int i=100;i>=1;i--){
            System.out.println(i);
        }
        int j = 0;
        while(j<=100){
            System.out.println(j);

            j = j +2;
        }








    }
}