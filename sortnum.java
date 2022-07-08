import java.util.Scanner;
public class sortnum {

    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner innput = new Scanner(System.in);

        System.out.println("num1");
        number1 = innput.nextInt();
        System.out.println("num2");
        number2 = innput.nextInt();
        System.out.println("num3");
        number3 = innput.nextInt();
        System.out.println("num4");
        number4 = innput.nextInt();
        System.out.println("num5");
        number5 = innput.nextInt();
        

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            System.out.print(number1 + ",");
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            System.out.print(number2 + ",");
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            System.out.print(number3 + ",");
        } else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
            System.out.print(number4 + ",");
        } else if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
            System.out.print(number5 + ",");
    }
    
}
}