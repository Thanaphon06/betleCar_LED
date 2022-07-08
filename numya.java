import java.util.Scanner;


public class numya{
    public static void main(String[] args) {

       

        Scanner input = new Scanner(System.in);

        System.out.println("num1");
        int num1 = input.nextInt();
        System.out.println("num2");
        int num2 = input.nextInt();
        System.out.println("num3");
        int num3 = input.nextInt();
        System.out.println("num4");
        int num4 = input.nextInt();
        System.out.println("num5");
        int num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("one"+num1);
            if ( num2 > num3 && num2 > num4 && num2 > num5 ){
            System.out.println("two"+num2);
            if (num3 > num4 && num3 > num5){
            System.out.println("two"+num3);
            if (num4 > num5){
            System.out.println("two"+num4);
            System.out.println("two"+num5);
            }
        }}}


    



      /*   if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        if (num3 > num1)
            System.out.println(num3);
            System.out.println(num1);
        }else if (num1 > num3){
            System.out.println(num1);
            System.out.println(num3);
        }

        if (num3> num1 && num3 > num2) {
            System.out.println(num3);
        if (num1 > num2)
            System.out.println(num1);
            System.out.println(num2);
        }else if (num2 > num1){
            System.out.println(num2);
            System.out.println(num1);
        }

                */

    }
    }

    