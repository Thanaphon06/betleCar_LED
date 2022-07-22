package After_July;

import java.util.Scanner;

public class cookie {

    public static void main(String[] args) {
        
        int number1, number2, number3, number4, number5;

        Scanner InputNumber = new Scanner(System.in);

        System.out.println("Enter num1");
        number1 = InputNumber.nextInt();
        System.out.println("Enter num2");
        number2 = InputNumber.nextInt();
        System.out.println("Enter num3");
        number3 = InputNumber.nextInt();
        System.out.println("Enter num4");
        number4 = InputNumber.nextInt();
        System.out.println("Enter num5");
        number5 = InputNumber.nextInt();
        
        if(number1 > number2 && number1>number3 && number1>number4 && number1>number5){
            System.out.println(number1);
            if(number2>number3 && number2>number4 && number2 >number5){
                System.out.println(number2);
                if(number3 > number4 && number3 > number5){
                    System.out.println(number3);
                    if(number4 > number5){
                        System.out.println(number4);
                        System.out.println(number5);
            }else if(number3 > number2 && number3 > number4 && number3 > number5){
                System.out.println(number3);
            }else if(number4 > number2 && number4 > number3 && number4 > number5){
                System.out.println(number4);
            }else if(number5 > number2 && number5 > number4 && number5 > number3){
                System.out.println(number5);
            }else if(number4 > number3 && number4 > number5){
                System.out.println(number4);
            }else if(number5 > number3 && number5 > number4){
                System.out.println(number5);
            }else if(number5 > number4){
                System.out.println(number5);
                System.out.println(number4);
            }
    }
}
}
}}
